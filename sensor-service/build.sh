echo "Сборка Docker контейнера.."
docker build -t sensors-service .

echo "Тэг Docker контейнера.."
docker tag sensors-service gazizulin24/mts_city:sensors-service


echo "Пуш Docker контейнера.."
docker push gazizulin24/mts_city:sensors-service