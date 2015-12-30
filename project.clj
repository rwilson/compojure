(defproject rwilson/compojure "1.4.0p1"
  :description "A concise routing library for Ring"
  :url "https://github.com/rwilson/compojure/tree/1.4.0p1"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/tools.macro "0.1.5"]
                 [clout "2.1.2"]
                 [medley "0.6.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-codec "1.0.0"]]
  :plugins [[codox "0.8.13"]]
  :codox {:src-dir-uri "https://github.com/rwilson/compojure/blob/1.4.0p1"
          :src-linenum-anchor-prefix "L"}
  :profiles
  {:dev {:jvm-opts ^:replace []
         :dependencies [[ring/ring-mock "0.2.0"]
                        [criterium "0.4.3"]
                        [javax.servlet/servlet-api "2.5"]]}
   :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
   :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}})
