package rest.api.doc

import grails.converters.JSON
import org.restapidoc.APIUtils

class ApiDocController {

    def index() {
        def result = APIUtils.buildApiRegistry(grailsApplication)
        render result as JSON
    }
}
