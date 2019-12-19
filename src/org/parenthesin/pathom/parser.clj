(ns org.parenthesin.pathom.parser
  (:require
    [org.parenthesin.controllers.splashed.resolvers :as splashed.res]
    [com.wsscode.pathom.core :as p]
    [com.wsscode.pathom.connect :as pc]
    [com.wsscode.pathom.profile :as pp]
    [pathom.pedestal :refer [pathom-routes make-parser]]))

(def resolvers [splashed.res/resolvers])

(def pathom-parser
  (p/parser {::p/env     {::p/reader               [p/map-reader
                                                      pc/reader2
                                                      pc/ident-reader
                                                      p/env-placeholder-reader]
                            ::pc/resolver-dispatch   pc/resolver-dispatch-embedded
                            ::pc/mutate-dispatch     pc/mutation-dispatch-embedded
                            ::p/placeholder-prefixes #{">"}
                            ::db                     (atom {})}
             ::p/mutate  pc/mutate
             ::p/plugins [(pc/connect-plugin {::pc/register resolvers})
                          p/error-handler-plugin
                          p/request-cache-plugin
                          pp/profile-plugin]}))

(def routes (pathom-routes {:oge? true :parser pathom-parser}))
