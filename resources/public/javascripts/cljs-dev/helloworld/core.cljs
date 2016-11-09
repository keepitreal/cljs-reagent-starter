(ns helloworld.core
  (:require [reagent.core :as reagent]))

(defn app []
  [:div {}
    ])

(reagent/render [app] (js/document.querySelector "#cljs-target"))
