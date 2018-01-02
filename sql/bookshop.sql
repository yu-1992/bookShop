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
author_biography varchar(200)
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
values("有島武朗","1878-1923年","明治11年、東京生まれ。札幌農学校卒業後、3年間アメリカに留学。帰国後、母校の予科教授となる。43年、創刊された雑誌『白樺』の同人となり、文学活動をはじめる。代表作に『カインの末裔』、『或る女』、『惜しみなく愛は奪ふ』などがある。"),
		("泉鏡花","1873-1939年","石川県金沢市生まれ。本名鏡太郎。9歳で母を失い、17歳の年に上京し、尾崎紅葉宅に住み込む。代表作に『外科室』、『高野聖』、『婦系図』などの作品があり、幻想文学の先駆者としても評価される。"),
		("梶井基次郎","1901-1932年","大阪生まれ。少年時代は三重、東京などに転居を繰り返す。19年、エンジニアを目指して三高理科に入学するが次第に文学に惹かれ、24年、東京帝大英文科に入学。同人誌『青空』で積極的に活動するが、少年時代からの肺結核が悪化し卒業は叶わなかった。初めての創作集『檸檬』刊行の翌年、郷里大阪にて逝去。享年31。"),
		("太宰治","1909-1948年","青森県金木村（現・五所川原市金木町）生まれ。本名は津島修治。東大仏文科中退。在学中、非合法運動に関係するが、脱藩。酒場の女性と鎌倉の小動崎で心中をはかり、ひとり助かる。代表作に『走れメロス』、『津軽』、『お伽草紙』、『人間失格』などがある。山崎富栄と玉川上水で入水自殺。"),
		("谷崎潤一郎","1886-1965年","東京日本橋生まれ。旧制府立一中、第一高等学校を経て東京帝大国文科に入学するも、のち中退。『三田文学』誌上で永井荷風に激賞され、文壇的地位を確立した。代表作に『痴人の愛』、『卍（まんじ）』、『春琴抄』、『細雪』などがある。"),
		("夏目漱石","1867-1916年","江戸の牛込馬場下横町（現在の東京都新宿区喜久井町）出身。大学時代に正岡子規と出会い、俳句を学ぶ。帝国大学英文科卒業後、松山で愛媛県尋常中学校教師、熊本で第五高等学校教授などを務めた後、イギリスへ留学。帰国後、東京帝国大学講師として英文学を講じながら、『我輩は猫である』を発表。他代表作に『坊ちゃん』、『草枕』、『こころ』などがある。"),
		("堀辰雄","1904-1953年","東京市麹町区平河町に生まれる。第一高等学校卒業後、東京帝国大学国文科に入学。1930年、芥川の死に対するショックから生と死と愛をテーマにした『聖家族』を発表し、1934年『美しい村』、1938年『風立ちぬ』で作家としての地位を確立する。他代表作として『燃ゆる頬』、『麦藁帽子』、『菜穂子』等がある。");



