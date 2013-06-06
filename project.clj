(defproject lein-hello "0.1.0-SNAPSHOT"
  :description "Leiningen plugin that prints a friendly message!"

  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :comments "same as Clojure"}
  :url "http://github.com/noahlz/lein-hello"

  :eval-in-leiningen true

  :profiles {:test {:dependencies [[midje "1.5.1"]]
                    :plugins [[lein-midje "3.0.1"]]}
             :dev [:test {:repl-options 
                           {:init (do (use 'midje.repl) (autotest))}}]}

  :aliases {"midje" ["with-profile" "test" "midje"]
            "test" ["with-profile" "test" "midje"]})
