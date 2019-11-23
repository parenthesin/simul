(ns org.parenthesin.server
  (:require [com.stuartsierra.component :as component]))

(defn start-system! [system-map system]
  (->> system-map
       component/start
       (reset! system)))

(defn stop-system! [system]
  (swap! system #(component/stop %)))
