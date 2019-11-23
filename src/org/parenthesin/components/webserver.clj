(ns org.parenthesin.components.webserver
  (:require [com.stuartsierra.component :as component]))

(defrecord WebServer [config routes storage]
  component/Lifecycle
  (start [this]
    (println ";; Starting webserver")
    (println "port:" (get-in config [:config :webserver-port]))
    (println "cors:" (get-in config [:config :cors-allowed-origins]))
    (println "unsplash:" (get-in config [:config :unsplash-access-key]))
    (assoc this :service {}))

  (stop [this]
    (println ";; Stopping webserver")
    (dissoc this :service)
    this))

(defn new-webserver []
  (map->WebServer {}))
