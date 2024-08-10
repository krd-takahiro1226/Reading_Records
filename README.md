# アプリ概要
- 読んだ本について名前、著者、読んだ回数を管理
  - 本の検索は何かしらの外部API叩いて取得
    - そこから登録ボタン押下(+必要な情報)で登録可能
- 読んだことがない本で読みたい本についても管理
  - 一覧でほしくて優先度みたいなものもつけれる
    - 画面から優先度登録が行える

# 動作確認環境
- MySQL 8.0.37
  - 最新は 8.4 LTS だが、当分8.0.37で進める
- Java 21.0.2
  - 最新は 21.0.3 (藤井はこのverで進めます)
- Maven
  - Apache Maven 3.9.6

# アプリの動かし方
- まずpullする
- application.properties で、自環境のSQLパスワードに合わせる
- MySqlでクエリ（create、insert）を実行する
  - SQL文は、sqlフォルダにある
- $ mvn clean install
  - 実行するパスは　Reading_Records/backend/backend
- BackendApplication.java でRunする
- ローカル環境でのURLは、localhost:8080/login
