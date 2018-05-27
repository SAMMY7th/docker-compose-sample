# ベースとなるイメージ
FROM openjdk:8-jdk-alpine
# コンテナにjarファイルをコピー
COPY build/libs/docker-compose-sample-0.0.1-SNAPSHOT.jar app.jar
# コンテナ起動時に実行するコマンド
ENTRYPOINT ["java","-jar","/app.jar"]