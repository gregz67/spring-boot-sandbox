yieldUnescaped '<!DOCTYPE html>'
html {
    head {
        title(pageTitle)
        link(rel: 'stylesheet', href: "http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css")
    }
    body {
        div(class: 'container') {
            div(class: 'navbar') {
                div(class: 'navbar-inner') {
                    span("One")
                    span("Two")
                }
            }
            mainBody()
        }
    }
}