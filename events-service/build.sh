echo "Сборка Docker контейнера.."
docker build -t events-service .

echo "Тэг Docker контейнера.."
docker tag sensors-service gazizulin24/mts_city:events-service


echo "Пуш Docker контейнера.."
docker push gazizulin24/mts_city:events-service