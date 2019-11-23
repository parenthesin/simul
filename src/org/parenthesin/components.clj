(ns org.parenthesin.components
  (:require [com.stuartsierra.component :as component]
            [org.parenthesin.components.config :as config]
            [org.parenthesin.components.routes :as routes]
            [org.parenthesin.components.webserver :as webserver]
            [org.parenthesin.services :as services]))

(defn build-system-map []
  (component/system-map
    :config (config/new-config)
    :routes  (routes/new-routes #'services/routes)
    :http-server (component/using (webserver/new-webserver) [:config :routes])))
