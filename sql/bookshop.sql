set names utf8;
set foreign_key_checks=0;

drop database if exists bookshop;

create database if not exists bookshop;
use bookshop;


-- ログイン登録情報

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
user_mail varchar(50),
insert_date datetime,
updated_date datetime
);

-- 商品情報

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_img varchar(40),
item_author varchar(30),
item_year varchar(60),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

-- 商品購入情報

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
item_author varchar(30),
item_img varchar(40),
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);

-- 著者情報

drop table if exists author_info_transaction;

create table author_info_transaction(
id int not null primary key auto_increment,
author_name varchar(30),
author_year varchar(20),
author_biography varchar(100)
);




-- insert文



-- 商品情報

insert into item_info_transaction(item_name,item_img,item_author,item_year,item_price,item_stock)
values("小さき者へ","./img/tisakimonohe01.jpg","有島武朗","「新潮」1918（大正7）年1月",300,20),
		("外科室","./img/gekashitsu01.jpg","泉鏡花","「文芸倶楽部」1895（明治28）年6月",240,14),
		("檸檬","./img/remon01.jpg","梶井基次郎","「青空」1925（大正14）年1月",230,23),
		("過古","./img/kako01.jpg","梶井基次郎","「青空」青空社、1926（大正15）年1月号",260,18),
		("桜の樹の下には","./img/sakuranokinoshitaniha01.jpg","梶井基次郎","「詩と詩論」1928（昭和3）年12月",220,23),
		("道化の華","./img/doukenohana01.jpg","太宰治","「日本浪漫派　第一巻第三号」1935（昭和10）年5月号",320,16),
		("ダス・ゲマイネ","./img/dasugemaine01.jpg","太宰治","「文藝春秋　第十三巻第十号」1935（昭和10）年10月1日",360,14),
		("グッド・バイ","./img/guddobai01.jpg","太宰治","「朝日評論」1948（昭和23）年7月",380,21),
		("刺青","./img/shisei01.jpg","谷崎潤一郎","「新思潮」1910（明治43）年11月号",240,13),
		("春琴抄","./img/syunkinsyou01.jpg","谷崎潤一郎","「中央公論」中央公論社、1933（昭和8）年6月",380,25),
		("三四郎","./img/sanshirou01.jpg","夏目漱石","「朝日新聞」1908（明治41）年9月1日～12月29日",480,48),
		("それから","./img/sorekara01.jpg","夏目漱石","「東京朝日新聞」、「大阪朝日新聞」1909（明治42）年6月27日〜10月4日",460,32),
		("菜穂子","./img/naoko01.jpg","堀辰雄","「中央公論」1941（昭和16）年3月号",290,12),
		("風立ちぬ","./img/kazetatinu01.jpg","堀辰雄","序曲、風立ちぬ「改造」1936（昭和11）年12月号",320,22);




-- ログイン登録情報（テストユーザー）

insert into login_user_transaction(login_id,login_pass,user_name,user_mail)
values("yu","1234","hashimoto yu","yu@1234.com");


-- 著者情報
insert into author_info_transaction(author_name,author_year,author_biography)
values("有島武朗","年など","有島武朗の略歴"),
		("泉鏡花","年など","泉鏡花の略歴"),
		("梶井基次郎","年など","梶井基次郎の略歴"),
		("太宰治","年など","太宰治の略歴"),
		("谷崎潤一郎","年など","谷崎潤一郎の略歴"),
		("夏目漱石","年など","夏目漱石の略歴"),
		("堀辰雄","年など","堀辰雄の略歴");



