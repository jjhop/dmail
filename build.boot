
(set-env!
 :resource-paths #{"src"}
 :dependencies `[[org.clojure/clojure "1.10.0"]])

(task-options!
 pom {:project 'dmail
      :version "0.0.1-SNAPSHOT"}
 jar {:manifest {"ProjectName" "dmail"}})
