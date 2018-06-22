-- 175

-- 表1: Person
--
-- +-------------+---------+
-- | 列名         | 类型     |
-- +-------------+---------+
-- | PersonId    | int     |
-- | FirstName   | varchar |
-- | LastName    | varchar |
-- +-------------+---------+
-- PersonId 是上表主键
-- 表2: Address
--
-- +-------------+---------+
-- | 列名         | 类型    |
-- +-------------+---------+
-- | AddressId   | int     |
-- | PersonId    | int     |
-- | City        | varchar |
-- | State       | varchar |
-- +-------------+---------+
-- AddressId 是上表主键
--
--
-- 编写一个 SQL 查询，满足条件：无论 person 是否有地址信息，都需要基于上述两表提供 person 的以下信息：
--
--
--
-- FirstName, LastName, City, State


select p.FirstName,p.LastName,a.City,a.State from person p left outer join Address a on p.PersonId=a.PersonId
select p.FirstName,p.LastName,a.City,a.State from person p left join Address a on p.PersonId=a.PersonId



-- 627

-- 给定一个 salary表，如下所示，有m=男性 和 f=女性的值 。交换所有的 f 和 m 值(例如，将所有 f 值更改为 m，反之亦然)。要求使用一个更新查询，并且没有中间临时表。
--
-- 例如:
--
-- | id | name | sex | salary |
-- |----|------|-----|--------|
-- | 1  | A    | m   | 2500   |
-- | 2  | B    | f   | 1500   |
-- | 3  | C    | m   | 5500   |
-- | 4  | D    | f   | 500    |
-- 运行你所编写的查询语句之后，将会得到以下表:
--
-- | id | name | sex | salary |
-- |----|------|-----|--------|
-- | 1  | A    | f   | 2500   |
-- | 2  | B    | m   | 1500   |
-- | 3  | C    | f   | 5500   |
-- | 4  | D    | m   | 500    |
UPDATE salary SET sex = IF(sex='m','f','m');

-- 620

-- 某城市开了一家新的电影院，吸引了很多人过来看电影。该电影院特别注意用户体验，专门有个 LED显示板做电影推荐，上面公布着影评和相关电影描述。
--
-- 作为该电影院的信息部主管，您需要编写一个 SQL查询，找出所有影片描述为非 boring (不无聊) 的并且 id 为奇数 的影片，结果请按等级 rating 排列。
--
--
--
-- 例如，下表 cinema:
--
-- +---------+-----------+--------------+-----------+
-- |   id    | movie     |  description |  rating   |
-- +---------+-----------+--------------+-----------+
-- |   1     | War       |   great 3D   |   8.9     |
-- |   2     | Science   |   fiction    |   8.5     |
-- |   3     | irish     |   boring     |   6.2     |
-- |   4     | Ice song  |   Fantacy    |   8.6     |
-- |   5     | House card|   Interesting|   9.1     |
-- +---------+-----------+--------------+-----------+
-- 对于上面的例子，则正确的输出是为：
--
-- +---------+-----------+--------------+-----------+
-- |   id    | movie     |  description |  rating   |
-- +---------+-----------+--------------+-----------+
-- |   5     | House card|   Interesting|   9.1     |
-- |   1     | War       |   great 3D   |   8.9     |
-- +---------+-----------+--------------+-----------+

select * from cinema where description!='boring' and mod(id,2)=1 order by rating desc;
SELECT * FROM cinema WHERE (id % 2 = 1) AND (description <> 'boring') ORDER BY rating DESC


--595

-- 这里有张 World表
-- --
-- -- +-----------------+------------+------------+--------------+---------------+
-- -- | name            | continent  | area       | population   | gdp           |
-- -- +-----------------+------------+------------+--------------+---------------+
-- -- | Afghanistan     | Asia       | 652230     | 25500100     | 20343000      |
-- -- | Albania         | Europe     | 28748      | 2831741      | 12960000      |
-- -- | Algeria         | Africa     | 2381741    | 37100000     | 188681000     |
-- -- | Andorra         | Europe     | 468        | 78115        | 3712000       |
-- -- | Angola          | Africa     | 1246700    | 20609294     | 100990000     |
-- -- +-----------------+------------+------------+--------------+---------------+
-- -- 如果一个国家的面积超过300万平方公里，或者人口超过2500万，那么这个国家就是大国家。
-- --
-- -- 编写一个SQL查询，输出表中所有大国家的名称、人口和地区。
-- --
-- -- 例如，根据上表，我们应该输出:
-- --
-- -- +--------------+-------------+--------------+
-- -- | name         | population  | area         |
-- -- +--------------+-------------+--------------+
-- -- | Afghanistan  | 25500100    | 652230       |
-- -- | Algeria      | 37100000    | 2381741      |
-- -- +--------------+-------------+--------------+

select w.name,w.population,w.area from World w where w.area>3000000 or w.population>25000000