curl -i http://localhost:8080/api/todo   -смотрим работосопсобность ПО (метод getToDos возвращает ResponseEntity<Iterable<ToDo> коллекция объектов туду.8080По умолч. ответ возвр. в формате JSON(заголовок content-type)
доб. запл. дела:
curl -i -X POST -H "Context-Type: application/json" -d'{"description":"Read the book"}' http://localhost:8080/api/todo
или можно команду сохр. в текстовый файл (json.txt) и отправить @json.txt
НТТР-метод пост (-x POST) и данные (-d) в формате JSON Мы отправл. только после описания ("description") важно указать заголовок (-Н) и указать конечную точку (/api/todo)
в Locatioin - виден идентификатор только что созданного объекта ТУДУ (ответ был сгенерирован методом createToDo)
curl -s http://localhost:8080/api/todo | jq - в красивом виде отобр. информации
редактируем содержимое сообщения:
curl -i -X PUT -H "Context-Type: application/json" -d'{"description":"Abra-kodabra", "id":"взять из списка"}' http://localhost:8080/api/todo
закончить дело:
curl -i -X PATCH http://localhost:8080/api/todo/77040dd7-858f-4668-964b-e3d3a28a1d59  опция  -X PATCH обрабатывается методом setCompleted, значение поля completed = true
удаляем законченное дело:
curl -i -X  DELETE http://localhost:8080/api/todo/77040dd7-858f-4668-964b-e3d3a28a1d59  опция  -X DELETE обрабатывается методом deleteToDo, который удаляет объект ToDo из хеш-карты
Проверка ошибки: пустое поле description
curl -i -X POST -H "Context-Type: application/json" -d'{"description":""}' http://localhost:8080/api/todo  получили код состоянии 400 (неверный запрос), а также сф-ый классом ToDoValidationErrorBuilder ответ в виде errors и errorMessadge
curl -i -X POST -H "Context-Type: application/json" http://localhost:8080/api/todo выполняем POST без данных, получаем сообщ. об ошибке от аннотации @ExceptionHandler  и метода handleException.
все ошибки кроме пустоты ДЕСКРИПШИН обрабатываются этим методом.
    Content-type:json/xml
    springMVC использует для согласования преобр-ий конт ента при HTTP-обмене класс TttpMessegeConverters


    SprBoot WEB: клиент