(ns leiningen.new.cljs-exnihilo
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]
        [leinjacker.utils :only [lein-generation]]))

 (def render (renderer "cljs-exnihilo"))

(defn cljs-exnihilo
  "Create a new ClojureScript project"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (println "\nAnd then some programmer said, \n 'Let there be a ClojureScript project!'
                   \nAnd so was born" (str name "...") )
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["README.md"   (render "README.md")]
             ["src/clj/{{sanitized}}/server.clj"      (render "server.clj" data)]
             ["src/cljs/{{sanitized}}/client.cljs"       (render "client.cljs" data)]
             ["resources/public/css/style.css" (render "style.css" data)]
             ["resources/public/css/style.scss" (render "style.scss" data)]
             ["resources/public/exnihilo.html" (render "exnihilo.html" data)]
      )))
