echo "Сборка Docker контейнера.."
docker build -t service-registry .

echo "Тэг Docker контейнера.."
docker tag service-registry gazizulin24/mts_city:service-registry


echo "Пуш Docker контейнера.."
docker push gazizulin24/mts_city:service-registry