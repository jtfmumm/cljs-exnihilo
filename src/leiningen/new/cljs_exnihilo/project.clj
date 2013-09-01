(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                            [org.clojure/clojurescript "0.0-1806"]
                            [compojure "1.1.5"]
                            [prismatic/dommy "0.1.1"]
                            [hiccup "1.0.4"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "0.3.2"]
                 [ring "1.2.0"]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {
              :builds {
                        :main {
                                   :source-path "src/cljs"
                                   :compiler {
                                              :output-to "resources/public/js/cljs.js"
                                              :optimizations :simple
                                              :pretty-print true}}}}
  :main {{name}}.server
  :ring {:handler {{name}}.server/handler})

