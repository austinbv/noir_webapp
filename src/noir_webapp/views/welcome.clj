(ns noir_webapp.views.welcome
  (:require [noir_webapp.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to noir_webapp"]))
