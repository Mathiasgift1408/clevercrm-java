# CleverCRM (Java, Spring Boot)

CRM modulare con architettura esagonale (modular monolith pronto per microservizi). Include API REST per `contacts`, profili `dev` (H2) e `prod` (Postgres), OpenAPI, Docker e CI.

## Avvio rapido (senza Docker)
```bash
# Java 17+ e Maven
mvn spring-boot:run
# Swagger UI:
# http://localhost:8080/swagger-ui/index.html
```

## Avvio con Docker Compose
```bash
docker compose up --build
# API su http://localhost:8080
# Swagger UI: http://localhost:8080/swagger-ui/index.html
```

## Endpoints principali
- `GET /api/contacts`
- `POST /api/contacts` (body: `{ "firstName": "...", "lastName": "...", "email": "..." }`)
- `GET /api/contacts/{id}`

## Test
```bash
mvn test
```

## Prossimi passi
- Aggiungere bounded context `deals`, `billing`, `notifications`.
- Integrare sicurezza (JWT) e OpenTelemetry.
- Estrarre microservizi (eventi dominio / outbox).

---
© drfb02
