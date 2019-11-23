(defproject org.parenthesin/simul "0.1.0-SNAPSHOT"
  :description "GraphQL BFF for our live demo Web App"
  :url "https://github.com/parenthesin/simul"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [yogthos/config "1.1.6"]]
  :main ^:skip-aot org.parenthesin.simul
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})