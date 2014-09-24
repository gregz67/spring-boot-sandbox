layout "layouts/main.tpl",
        pageTitle: "$pageTitle",
        mainBody: contents {
            ul {
                li("message = $message")
            }
        }
