# CleverCRM (Java, Spring Boot)
CRM modulare con architettura esagonale (modular monolith pronto per microservizi). Include API REST per `contacts`, profili `dev` (H2) e `prod` (Postgres), OpenAPI, Docker e CI.

> **Disclaimer**
> This repository is an educational **demo** for end-to-end ML (training + serving).
> The model is trained on **synthetic data** and **must not** be used to make real financial decisions.
> No real personal data is included.

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

## Limitations & Responsible Use
- Synthetic dataset; results are illustrative only.
- No calibration/monitoring/drift checks included yet.
- No PII is processed; do not submit real customer data to the demo API.
- Before any production use, add: data governance, monitoring, bias audits, rate limiting, auth, logging, model registry (e.g., MLflow).


---

© drfb02
