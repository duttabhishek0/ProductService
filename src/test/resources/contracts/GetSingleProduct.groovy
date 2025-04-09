package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description "A request for product by ID"

    request {
        url "/products/1"
        method GET()
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(
                "available": true,
                "description": "A classic novel written by F. Scott Fitzgerald.",
                "id": 1,
                "name": "The Great Gatsby",
                "price": 10.99
        )
    }
}