# Hiccup-Bootstrap-3

Hiccup-Bootstrap provides [Hiccup][1] functions for Twitter's
[Bootstrap 3][2] framework.

[1]: https://github.com/weavejester/hiccup
[2]: http://twitter.github.com/bootstrap/index.html

## Installation

Add the following dependency to your `project.clj` file:

    [hiccup-bootstrap-3 "0.2.0-SNAPSHOT"]

Note that if you're using Ring, you'll need version 1.1.0 or later.

## Usage

Add the `wrap-bootstrap-resources` middleware to your handler to
automatically add routes for the various bootstrap CSS, image and JS
files:

```clojure
(use 'hiccup.bootstrap.middleware)

(def app
  (wrap-bootstrap-resources handler))
```

Then in your Hiccup template, add in `include-bootstrap` in the page
header:

```clojure
(use 'hiccup.core
     'hiccup.page
     'hiccup.bootstrap.page)
     
(defn page []
  (html5
    [:head
      [:title "Bootstrapped Example"]
      (include-js "//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js")
      (include-bootstrap)]
    [:body
      [:h1 "Bootstrapped Example"]]))
```

## jQuery required

Please note that all Bootstrap's JavaScript plugins require jQuery to be included, as shown in the example above.

## License

Copyright © 2012 James Reeves
Copyright © 2013 Alexander Zolotko

Distributed under the Eclipse Public License, the same as Clojure.
