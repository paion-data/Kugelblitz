Entity Webservice
=================

![Java Version Badge][Java Version Badge]
[![API Doc Badge]][API Doc URL]
[![Docker Hub][Docker Pulls Badge]][Docker Hub URL]
[![Apache License Badge]][Apache License, Version 2.0]

__Entity Webservice__ is a Spring Boot application template that lets us set up REST JSON API webservice with
minimal effort. Its goal is to swiftly productionize a persistence webservice with modern CI/CD support.

Entity Webservice is designed for:

- non-business persistence capabilities
- performance-wise caching

It __is not for__:

- security aspect, such as Authentication or Authorization
- any business layer logics

For this reason, Entity Webservice is suitable for a microservice architecture.

✨ Features
-----------

- __Explicit interface__: Entity WS specifically serves impersonation-free CRUD operations
- __Tech agnostic API__: In a world of constant and rapid changes, Entity WS does not require integration technology
  that dictates what technology stack to use for interactions
- __Simple__: Entity WS allows clients full freedom in technology choice by [![API Doc Badge]][API Doc URL]

🚀 Quick Start
--------------

Start a production quality service at [entity-ws.paion-data.dev](https://entity-ws.paion-data.dev/docs/intro).

License
-------

The use and distribution terms for [entity-ws]() are covered by the [Apache License, Version 2.0].

[Apache License Badge]: https://img.shields.io/badge/Apache%202.0-F25910.svg?style=for-the-badge&logo=Apache&logoColor=white
[Apache License, Version 2.0]: https://www.apache.org/licenses/LICENSE-2.0
[API Doc Badge]: https://img.shields.io/badge/Open%20API-Swagger-85EA2D.svg?style=for-the-badge&logo=openapiinitiative&logoColor=white&labelColor=6BA539
[API Doc URL]: https://springdoc.org/

[Docker Pulls Badge]: https://img.shields.io/docker/pulls/paiondatahub/entity-ws?style=for-the-badge&logo=docker&color=2596EC
[Docker Hub URL]: https://hub.docker.com/r/paiondatahub/entity-ws

[Java Version Badge]: https://img.shields.io/badge/Java-17-brightgreen?style=for-the-badge&logo=OpenJDK&logoColor=white
