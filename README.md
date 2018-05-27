## 実行方法
プロジェクト直下で 下記コマンド実行

- `./gradlew build` 
- `docker-compose up`

## API仕様
Content-Typeは`application/x-www-form-urlencoded`

- `GET /users` (取得)

```
[
  {
    "id": 1,
    "firstName": "taro",
    "familyName": "jjug"
  }
]
```
     
- `POST /users` (作成)
    - パラメータ名 `firstName`, `familyName` 
- `POST /users/<id>` (更新)
    - パラメータ名 `firstName`, `familyName` 
- `POST /users/<id>/delete` (削除) 
    

