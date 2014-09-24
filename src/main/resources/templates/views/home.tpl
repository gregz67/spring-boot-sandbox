layout "layouts/main.tpl",
        pageTitle: "$pageTitle",
        mainBody: contents {
            ul {
                li("$greeting")
                li("$farewell")
            }
            div("$footer")
        }
