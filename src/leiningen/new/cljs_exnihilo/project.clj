(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1806"]
                 [compojure "1.1.5"]
                 [jayq "2.4.0"]
                 [hiccup "1.0.4"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "0.3.2"]
                 [lein-ring "0.8.7"]]

  :cljsbuild
    {:builds [{:source-paths ["src/cljs"],
               :id "main",
               :compiler {:optimizations :simple,
                          :output-to "resources/public/js/cljs.js",
                          :pretty-print true}}]}
  :main {{name}}.server
  :ring {:handler {{name}}.server/app})

