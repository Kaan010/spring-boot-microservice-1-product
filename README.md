# Microservice Product
This service is first of three micro-service.

### Endpoints:

#### Save Product
````
POST /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)
Content-Type: application/json

Content-Length: 45

{
    "name": "test-1",
    "price": 1.2
}
````

#### Get Product
````
GET /api/product HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)
````

#### Delete Product
````
DELETE /api/product/1 HTTP/1.1
Host: localhost:3333
Authorization: Basic base64(username:password)
````
