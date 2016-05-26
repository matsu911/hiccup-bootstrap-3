(ns hiccup.bootstrap.page
  (:use hiccup.page))

(defn include-bootstrap
  "Add Bootstrap CSS and JS resources to the page."
  []
  (list
   (include-css "/bootstrap/css/bootstrap.css")
   (include-js  "/bootstrap/js/bootstrap.js")))

(defn fixed-layout
  "Encase its contents in a fixed layout container."
  [& content]
  [:div.container content])
