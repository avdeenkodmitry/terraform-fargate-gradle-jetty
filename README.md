Для запуска ниже приведенных команд необходимо установить aws console, java, docker and terraform. Для обращения к AWS ECR и AWS ECS необходимо установить требуемый набор credentials(Подробнее: https://github.com/awslabs/amazon-ecr-credential-helper). 
Демонстрационный проект, представляющий собой Jersey приложение с запущенным jetty в embedded режиме. Для запуска ниже приведенных команд необходимо установить aws console, java, docker and terraform. Дляобращения к AWS ECR и AWS ECS необходимо установить требуемый набор credentials(Подробнее: https://github.com/awslabs/amazon-ecr-credential-helper). 
Для сборки и запуска приложения следует воспользоваться следующими командами, выполнеными в командной строке из корневой папки проекта:
```
gradle build 
java -jar build/libs/myapp-all.jar
```

Для сборки, автоматической упаковки и загрузки приложения в AWS ECR:

```
gradle jib
```
Для получения локальной копии docker образа:
```
gradle jibDockerBuild
```
Подробнее: https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin

Для деплоя образа из ECR в Fargate необходимо выполнить следующие команды:
```
terraform/terraform init
terraform/terraform apply
```
