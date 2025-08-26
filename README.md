# BookBuddy 📚
*A level-by-level Java CRUD project that grows in complexity step by step.*

BookBuddy starts as a simple console CRUD app and evolves into a production-grade backend service.  
Each level introduces one new engineering concept, like stacking LEGO blocks.

---

## Levels

### Level 0 — Core Domain & CRUD (Console)
- Pure Java, no frameworks.
- `Book` model with in-memory repository.
- Console menu for CRUD operations.

### Level 1 — Persistence with JDBC (H2)
- Store books in an H2 database.
- Use JDBC + connection pool.
- Learn SQL + transactions.

### Level 2 — HTTP API with Servlets
- Serve CRUD via HTTP endpoints.
- JSON payloads with Jackson.
- Basic error handling (404, 400, 500).

### Level 3 — Spring Boot REST
- Introduce Spring Boot (Controller → Service → Repository).
- DTOs + validation.
- Global error handler.

### Level 4 — JPA & Migrations
- ORM with Spring Data JPA.
- Schema migration via Flyway.
- Support `PATCH` for partial updates.

### Level 5 — Testing Pyramid
- Unit tests with JUnit + Mockito.
- Controller slice tests.
- Integration tests using Testcontainers.

### Level 6 — Packaging & Docker
- Fat JAR build.
- Multi-stage Dockerfile or Jib.
- Config via environment variables.

### Level 7 — Security & AuthZ
- JWT authentication.
- Role-based access (`LIBRARIAN`, `READER`).
- Method-level security.

### Level 8 — Caching & Performance
- Spring Cache with Caffeine/Redis.
- Cache reads, invalidate on writes.
- Pagination & sorting.

### Level 9 — Async & Messaging
- Publish "book catalogued" events.
- RabbitMQ/Kafka or Spring Events.
- Retry and dead-letter strategy.

### Level 10 — Files & S3-style Storage
- Upload book cover images.
- Store in S3/MinIO.
- Serve signed URLs.

### Level 11 — Observability
- Metrics with Micrometer + Prometheus.
- Health checks + actuator endpoints.
- Structured JSON logs with trace IDs.

### Level 12 — Config & Feature Flags
- Spring Profiles (`dev`, `test`, `prod`).
- Feature flags (Togglz/Unleash).
- Secrets via env vars.

### Level 13 — Multi-Tenancy (Lite)
- `tenant_id` column strategy.
- Tenant resolution via header.
- Query isolation.

### Level 14 — Deployment & CI/CD
- GitHub Actions pipeline.
- Build → test → scan → docker push → deploy.
- Blue/green or rolling deployment.
