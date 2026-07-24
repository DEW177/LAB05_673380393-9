# Coffee Menu Service REST API

## วิธีรันโปรเจกต์

```bash
mvn spring-boot:run
```

หรือ

```bash
./mvnw spring-boot:run
```

เมื่อรันสำเร็จ โปรแกรมจะทำงานที่

```
http://localhost:8080
```

---

## ตัวอย่างการเรียก API

### GET เมนูทั้งหมด

```
GET http://localhost:8080/coffees
```

### GET เมนูตาม ID

```
GET http://localhost:8080/coffees/1
```

### POST เพิ่มเมนู

```
POST http://localhost:8080/coffees
```

Body

```json
{
  "name": "Mocha",
  "price": 65
}
```

### PUT แก้ไขเมนู

```
PUT http://localhost:8080/coffees/3
```

Body

```json
{
  "name": "Mocha",
  "price": 70
}
```

### DELETE ลบเมนู

```
DELETE http://localhost:8080/coffees/3
```
