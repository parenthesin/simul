(defproject org.parenthesin/simul "0.1.0-SNAPSHOT"
  :description "GraphQL BFF for our live demo Web App"
  :url "https://github.com/parenthesin/simul"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [com.stuartsierra/component "0.4.0"]
                 [io.pedestal/pedestal.jetty "0.5.7"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [ch.qos.logback/logback-classic "1.2.3" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.29"]
                 [org.slf4j/jcl-over-slf4j "1.7.29"]
                 [org.slf4j/log4j-over-slf4j "1.7.29"]
                 [yogthos/config "1.1.6"]]
  :main ^:skip-aot org.parenthesin.simul
  :target-path "target/%s"
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "org.parenthesin.simul/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.5.7"]]}
             :uberjar {:aot :all}})
