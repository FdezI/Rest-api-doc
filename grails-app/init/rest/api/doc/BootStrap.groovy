package rest.api.doc

import org.restapidoc.JSONUtils

class BootStrap {

    def init = { servletContext ->
	   JSONUtils.registerMarshallers ()
    }
    def destroy = {
    }
}
