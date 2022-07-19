(defproject yast "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [compojure "1.7.0"]
                 [ring/ring-defaults "0.3.2"]]
  :main ^:skip-aot yast.core
  :target-path "target/%s"
  :ring {:handler yast.core/app}
  :profiles {
             :dependencies [[javax.servlet/servlet-api "2.5"]
                            [ring/ring-mock "0.3.2"]]
             :uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
