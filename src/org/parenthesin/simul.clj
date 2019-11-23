(ns org.parenthesin.simul
  (:require [io.pedestal.service-tools.dev :as dev]
            [org.parenthesin.components :as components]
            [org.parenthesin.server :as server])
  (:gen-class))

(def system (atom nil))

(defn -main
  "The entry-point for 'lein run'"
  [& args]
  (-> (components/build-system-map)
      (server/start-system! system)))

(defn run-dev
  "The entry-point for 'lein run-dev'"
  []
  (dev/watch) ;; auto-reload namespaces only in run-dev / repl-start
  (-main))
