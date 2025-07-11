# Ejemplos de Peticiones CRUD para Todas las Entidades

A continuación tienes ejemplos de cómo agregar, consultar, actualizar y eliminar datos en cada entidad usando Postman o cURL.

---

## 1. Member

### Crear (POST)
**POST** `http://localhost:8080/api-jakarta-rest/api/members`
```json
{
  "name": "Juan",
  "surname": "Pérez",
  "address": "Calle Falsa 123",
  "age": 30,
  "idMember": "M001"
}
```

### Listar todos (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/members`

### Obtener por ID (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/members/1`

### Actualizar por ID (PUT)
**PUT** `http://localhost:8080/api-jakarta-rest/api/members/1`
```json
{
  "name": "Juan Actualizado",
  "surname": "Pérez",
  "address": "Nueva Calle 456",
  "age": 31,
  "idMember": "M001"
}
```

### Eliminar por ID (DELETE)
**DELETE** `http://localhost:8080/api-jakarta-rest/api/members/1`

---

## 2. Librarian

### Crear (POST)
**POST** `http://localhost:8080/api-jakarta-rest/api/librarians`
```json
{
  "name": "Ana",
  "surname": "García",
  "address": "Av. Central 456",
  "age": 40,
  "idLibrarian": "L001"
}
```

### Listar todos (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/librarians`

### Obtener por ID (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/librarians/1`

### Actualizar por ID (PUT)
**PUT** `http://localhost:8080/api-jakarta-rest/api/librarians/1`
```json
{
  "name": "Ana Actualizada",
  "surname": "García",
  "address": "Nueva Av. 789",
  "age": 41,
  "idLibrarian": "L001"
}
```

### Eliminar por ID (DELETE)
**DELETE** `http://localhost:8080/api-jakarta-rest/api/librarians/1`

---

## 3. Publication

### Crear (POST)
**POST** `http://localhost:8080/api-jakarta-rest/api/publications`
```json
{
  "title": "El Quijote",
  "year": 1605,
  "author": "Miguel de Cervantes",
  "statusPublication": "AVAILABLE"
}
```

### Listar todos (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/publications`

### Obtener por ID (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/publications/1`

### Actualizar por ID (PUT)
**PUT** `http://localhost:8080/api-jakarta-rest/api/publications/1`
```json
{
  "title": "El Quijote (Edición Actualizada)",
  "year": 2024,
  "author": "Miguel de Cervantes",
  "statusPublication": "BORROWED"
}
```

### Eliminar por ID (DELETE)
**DELETE** `http://localhost:8080/api-jakarta-rest/api/publications/1`

---

## 4. Borrow

### Crear (POST)
**POST** `http://localhost:8080/api-jakarta-rest/api/borrows`
```json
{
  "fromDate": "2024-07-11T00:00:00Z",
  "toDate": "2024-07-18T00:00:00Z",
  "borrowStatus": "EN_CURSO",
  "member": { "id": 1 },
  "publication": { "id": 1 }
}
```
> Cambia los valores de `member.id` y `publication.id` por los IDs reales existentes en tu base de datos.

### Listar todos (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/borrows`

### Obtener por ID (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/borrows/1`

### Actualizar por ID (PUT)
**PUT** `http://localhost:8080/api-jakarta-rest/api/borrows/1`
```json
{
  "fromDate": "2024-07-12T00:00:00Z",
  "toDate": "2024-07-19T00:00:00Z",
  "borrowStatus": "FINALIZADO",
  "member": { "id": 1 },
  "publication": { "id": 1 }
}
```

### Eliminar por ID (DELETE)
**DELETE** `http://localhost:8080/api-jakarta-rest/api/borrows/1`

---

## 5. Issue

### Crear (POST)
**POST** `http://localhost:8080/api-jakarta-rest/api/issues`
```json
{
  "publishDate": "2024-07-11T00:00:00Z",
  "unpublishDate": "2024-07-18T00:00:00Z",
  "manageDate": "2024-07-11T00:00:00Z",
  "issueStatus": "ACTIVO",
  "librarian": { "id": 1 },
  "publication": { "id": 1 }
}
```
> Cambia los valores de `librarian.id` y `publication.id` por los IDs reales existentes en tu base de datos.

### Listar todos (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/issues`

### Obtener por ID (GET)
**GET** `http://localhost:8080/api-jakarta-rest/api/issues/1`

### Actualizar por ID (PUT)
**PUT** `http://localhost:8080/api-jakarta-rest/api/issues/1`
```json
{
  "publishDate": "2024-07-12T00:00:00Z",
  "unpublishDate": "2024-07-19T00:00:00Z",
  "manageDate": "2024-07-12T00:00:00Z",
  "issueStatus": "FINALIZADO",
  "librarian": { "id": 1 },
  "publication": { "id": 1 }
}
```

### Eliminar por ID (DELETE)
**DELETE** `http://localhost:8080/api-jakarta-rest/api/issues/1`

---

**Notas:**
- Usa el método adecuado (GET, POST, PUT, DELETE) y el header `Content-Type: application/json` para POST y PUT.
- Si usas Postman, pega el JSON en la pestaña **Body** (raw, JSON).
- Los campos de relación (`member`, `publication`, `librarian`) requieren que existan previamente los registros relacionados. 