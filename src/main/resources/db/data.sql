INSERT INTO user_tb (`id`,`username`, `password`,`user_pic_url`, `location`) VALUES ('1', 'ssar', '12345678', 'ssar.jpg', '부전동');
INSERT INTO user_tb (`id`,`username`, `password`,`user_pic_url`, `location`) VALUES ('2', 'cos', '12345678', 'cos.jpg', '전포동');

INSERT INTO product_tb (`id`,`product_name`, `price`,`category`, `content`, `product_pic_url`,`created_at`,`user_id`) VALUES ('1', '카본 로드 자전거 팝니다.', '200000', '자전거', '1년탄 자전거 팝니다.', 'bike.jpg', NOW(),1);
INSERT INTO product_tb (`id`,`product_name`, `price`,`category`, `content`, `product_pic_url`,`created_at`,`user_id`) VALUES ('2', '파티션 팝니다.', '200000', '행사', '파티션 이쁘게 해드려요!', 'partition.jpg', NOW(),1);
INSERT INTO product_tb (`id`,`product_name`, `price`,`category`, `content`, `product_pic_url`,`created_at`,`user_id`) VALUES ('3', '책 필요하신분', '200000', '책', '중고서적 팔아요', 'book.jpg', NOW(),1);
INSERT INTO product_tb (`id`,`product_name`, `price`,`category`, `content`, `product_pic_url`,`created_at`,`user_id`) VALUES ('4', '벤치프레스', '200000', '운동기구', '벤치프레스 팔아요', 'benchpress.jpg', NOW(),2);
INSERT INTO product_tb (`id`,`product_name`, `price`,`category`, `content`, `product_pic_url`,`created_at`,`user_id`) VALUES ('5', '견과류 팔아요', '200000', '식품', '블루베리도 포함되어있습니다.', 'nuts.jpg', NOW(),2);
INSERT INTO product_tb (`id`,`product_name`, `price`,`category`, `content`, `product_pic_url`,`created_at`,`user_id`) VALUES ('6', '장미꽃 팔아요', '200000', '꽃', '장미, 튤립, 패랭이꽃, 등등...', 'flower.jpg', NOW(),2);
