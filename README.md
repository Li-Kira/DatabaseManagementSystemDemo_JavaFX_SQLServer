# DatabaseManageSystemDemo_JavaFX_SQLServer
大三课设


# 数据库大作业

# 后端

# 绪论

## 要求：

1.任选下列一个题目（或类似题目），调查分析一个具体的或模拟的实例；

2.描述该实例的业务信息和管理工作的要求；

3.列出实体、联系；

4.指出实体和联系的属性；

5.画出 E-R 图；

6.将 E-R 图转换成关系模式，并注明主码和外码；

7.建立数据字典；

8.创建数据库；

9.根据题目的要求写查询、存储过程、触发器等

## 题目

### VCD 零售\出租管理系统

- 实现 VCD 类型及信息的管理；
- 实现 VCD 的入库管理；
- 实现 VCD 的借还管理；
- 实现 VCD 的零售管理；
- 创建触发器，入库登记、零售时自动修改、现货和库存，借、还时自动修改现货数量；
- 创建存储过程统计某段时间内各 VCD 的销售、借还数量；
- 创建视图查询各类 VCD 的库存情况；
- 建立数据库相关表之间的参照完整性约束。



# 说明书

## 需求分析

本系统可以分为VCD的信息管理和零售出租两个模块



### 信息管理

查询

- VCD基本信息、来源、内容的查询
- 可以通过标签找到想要的VCD
- 对VCD的库存剩余数量的查询，可以按照入库、售出、租出、归还进行查询；



### 零售出租

入库

- 对入库登记进行登记，自动修改、现货和库存



销售

- 零售时自动修改、现货和库存
- 销售时读取商品单价，自动算出总价





租凭

- 借、还时自动修改现货数量
- 会员制实名租凭，信誉低的顾客不给予租凭
- 可以从出租商品中追溯出租时间以及应还时间
- 出租的商品仍有编号，而且库存只显示在库的库存
- 出租时读取商品单价，自动算出总价





## 系统功能结构

音响店VCD零售/出租管理系统主要包括以下四个方面的功能：
1）VCD信息查询功能：以便于按信息查找VCD的客户，通过VCD名称、类型等寻找到自己想要的VCD；
2）VCD销售功能：记录售出的VCD情况，及时更新VCD的库存数量
3）VCD借还功能：记录VCD的借还情况，租赁价格，制定归还日期，便于商家管理VCD
4）VCD入库功能：VCD入库后自动更新VCD的库存量





## 数据流图

# 数据库大作业

# 后端

# 绪论

## 要求：

1.任选下列一个题目（或类似题目），调查分析一个具体的或模拟的实例；

2.描述该实例的业务信息和管理工作的要求；

3.列出实体、联系；

4.指出实体和联系的属性；

5.画出 E-R 图；

6.将 E-R 图转换成关系模式，并注明主码和外码；

7.建立数据字典；

8.创建数据库；

9.根据题目的要求写查询、存储过程、触发器等

## 题目

### VCD 零售\出租管理系统

- 实现 VCD 类型及信息的管理；
- 实现 VCD 的入库管理；
- 实现 VCD 的借还管理；
- 实现 VCD 的零售管理；
- 创建触发器，入库登记、零售时自动修改、现货和库存，借、还时自动修改现货数量；
- 创建存储过程统计某段时间内各 VCD 的销售、借还数量；
- 创建视图查询各类 VCD 的库存情况；
- 建立数据库相关表之间的参照完整性约束。



# 说明书

## 需求分析

本系统可以分为VCD的信息管理和零售出租两个模块



### 信息管理

查询

- VCD基本信息、来源、内容的查询
- 可以通过标签找到想要的VCD
- 对VCD的库存剩余数量的查询，可以按照入库、售出、租出、归还进行查询；



### 零售出租

入库

- 对入库登记进行登记，自动修改、现货和库存



销售

- 零售时自动修改、现货和库存
- 销售时读取商品单价，自动算出总价





租凭

- 借、还时自动修改现货数量
- 会员制实名租凭，信誉低的顾客不给予租凭
- 可以从出租商品中追溯出租时间以及应还时间
- 出租的商品仍有编号，而且库存只显示在库的库存
- 出租时读取商品单价，自动算出总价





## 系统功能结构

音响店VCD零售/出租管理系统主要包括以下四个方面的功能：
1）VCD信息查询功能：以便于按信息查找VCD的客户，通过VCD名称、类型等寻找到自己想要的VCD；
2）VCD销售功能：记录售出的VCD情况，及时更新VCD的库存数量
3）VCD借还功能：记录VCD的借还情况，租赁价格，制定归还日期，便于商家管理VCD
4）VCD入库功能：VCD入库后自动更新VCD的库存量





## 数据流图

![image-20211203183947089](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203183947089.png)





## 逻辑结构设计

VCD信息（VCD编号，标题，封面）

VCD来源（VCD编号，导演，制片人，编剧，主演，发行商）

VCD内容（VCD编号，语言，分级，国家地区，上映时间，时长，评分，片源质量，简介，又名）

VCD标签（VCD编号，标签编号，标签名称）

标签库（标签编号，标签名称）

商品信息（VCD编号，标题，封面，购买价格，出租价格，买断库存，租凭库存）

出租商品信息（出租商品编号，状态，VCD编号，标题）  

进货信息（进货订单编号，VCD编号，进货量）

客户信息（客户编号，姓名，出生日期，联系方式，信誉）

购买订单信息（购买订单编号，VCD编号，订单数量）

出租订单信息（出租订单编号，出租商品编号，客户编号，出租时间，应还时间，归还状态）





## 局部 E-R 图 

### VCD基本信息

![image-20211124202803937](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124202803937.png)



### VCD来源

![image-20211124202934310](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124202934310.png)







### VCD内容

![image-20211124202909522](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124202909522.png)

### 标签库

![image-20211124203000708](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203000708.png)

### 商品信息



![image-20211124203039471](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203039471.png)



### 出租商品信息

![image-20211124203058705](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203058705.png)

### 进货信息

![image-20211124203110104](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203110104.png)





### 客户信息

![image-20211124203121066](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203121066.png)





### 购买订单信息

![image-20211124203142999](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203142999.png)



### 出租订单信息

![image-20211124204829671](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124204829671.png)

## 全局 E-R 图

### 信息管理

![image-20211124203337764](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203337764.png)



### 出租零售

![image-20211124203251770](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203251770.png)



### 总览

![image-20211124204849465](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124204849465.png)







## 数据字典

不确定存储的数据长度，也有可能有中文，选择nvarchar类型

不确定存储的数据长度，存储只有英文、数字的选择varchar

没有具体到时间点用date

有具体时间的例如用户租借时间用datetime

### VCD信息

VCD_info

| 字段名 | 数据类型      | 默认值 | 允许非空 | 自动递增 | 备注       |
| ------ | ------------- | ------ | -------- | -------- | ---------- |
| VCD_id | varchar(10)   |        | NO       |          | VCD编号,PK |
| Title  | nvarchar(50)  |        |          |          | 标题       |
| Cover  | nvarchar(MAX) | URL    |          |          | 封面       |



### VCD来源

VCD_Source

| 字段名       | 数据类型      | 默认值 | 允许非空 | 自动递增 | 备注       |
| ------------ | ------------- | ------ | -------- | -------- | ---------- |
| VCD_id       | varchar(10)   |        | NO       |          | VCD编号,PK |
| Director     | nvarchar(50)  |        |          |          | 导演       |
| Producer     | nvarchar(50)  |        |          |          | 制片人     |
| Screenwriter | nvarchar(50)  |        |          |          | 编剧       |
| Cast         | nvarchar(MAX) |        |          |          | 主演       |
| Publisher    | nvarchar(50)  |        |          |          | 发行商     |



### VCD内容

VCD_Content

| 字段名       | 数据类型      | 默认值 | 允许非空 | 自动递增 | 备注               |
| ------------ | ------------- | ------ | -------- | -------- | ------------------ |
| VCD_id       | varchar(10)   |        | NO       |          | VCD编号,PK         |
| Language     | nvarchar(50)  |        |          |          | 语言               |
| Rating       | nvarchar(10)  |        |          |          | 分级               |
| Country      | nvarchar(50)  |        |          |          | 国家地区           |
| Release_Time | date          |        |          |          | 上映时间           |
| Duration     | INT           |        |          |          | 时长               |
| Score        | float         |        |          |          | 评分               |
| Resolution   | nvarchar(10)  |        |          |          | 片源质量（分辨率） |
| Introduction | nvarchar(MAX) |        |          |          | 简介               |
| Anothername  | nvarchar(50)  |        |          |          | 又名               |



### VCD标签

VCD_Tag

| 字段名   | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注    |
| -------- | ------------ | ------ | -------- | -------- | ------- |
| VCD_id   | varchar(10)  |        | NO       |          | VCD编号 |
| Tag_id   | varchar(10)  |        | NO       |          | Tag编号 |
| Tag_name | nvarchar(10) |        | NO       |          | Tag名称 |



### 标签库

Tag_lib

| 字段名   | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注       |
| -------- | ------------ | ------ | -------- | -------- | ---------- |
| Tag_id   | varchar(10)  |        | NO       |          | Tag编号,PK |
| Tag_name | nvarchar(10) |        | NO       |          | Tag名称    |



### 商品信息

Products_info

| 字段名          | 数据类型    | 默认值 | 允许非空 | 自动递增 | 备注       |
| --------------- | ----------- | ------ | -------- | -------- | ---------- |
| VCD_id          | varchar(10) |        | NO       |          | VCD编号,PK |
| Purchase_Price  | float       |        | NO       |          | 购买价格   |
| Rental_Price    | float       |        | NO       |          | 出租价格   |
| Purchase_Stocks | INT         |        | NO       | 入库则进 | 买断库存   |
| Rental_Stocks   | INT         |        | NO       | 入库则进 | 租凭库存   |



### 出租商品信息

Rental_info

| 字段名    | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注                |
| --------- | ------------ | ------ | -------- | -------- | ------------------- |
| Rental_id | varchar(10)  |        | NO       |          | 出租商品编号,PK     |
| Status    | nvarchar(10) |        | NO       |          | 状态，（在库/租出） |
| VCD_id    | varchar(10)  |        | NO       |          | VCD_id编号          |
| Title     | nvarchar(10) |        | NO       |          | 标题                |



### 进货订单信息

Stock_Order

| 字段名      | 数据类型    | 默认值 | 允许非空 | 自动递增 | 备注            |
| ----------- | ----------- | ------ | -------- | -------- | --------------- |
| Stock_order | varchar(10) |        | NO       |          | 入库订单编号,PK |
| VCD_id      | varchar(10) |        | NO       |          | VCD编号         |
| Quantity_in | INT         |        | NO       |          | 入库数量        |
| PorR        | varchar(10) | P/R    | NO       |          | 是否为入库      |



### 客户信息

Customer_info

| 字段名      | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注                               |
| ----------- | ------------ | ------ | -------- | -------- | ---------------------------------- |
| Customer_id | varchar(10)  |        | NO       |          | 客户编号,PK                        |
| Name        | nvarchar(10) |        | NO       |          | 姓名                               |
| Birthday    | DATE         |        | NO       |          | 出生日期                           |
| Contact     | varchar(11)  |        | NO       |          | 联系方式                           |
| Credit      | varchar(10)  | B      | NO       |          | 信誉，分A、B、C、D四级,D级不可租借 |



### 购买订单信息

Purchase_Order

| 字段名         | 数据类型    | 默认值 | 允许非空 | 自动递增 | 备注            |
| -------------- | ----------- | ------ | -------- | -------- | --------------- |
| Purchase_order | varchar(10) |        | NO       |          | 购买订单编号,PK |
| VCD_id         | varchar(10) |        | NO       |          | VCD编号         |
| Purchase_Out   | INT         |        | NO       |          | 出货量          |



### 出租订单信息

Rental_Order

| 字段名       | 数据类型     | 默认值          | 允许非空 | 自动递增            | 备注            |
| ------------ | ------------ | --------------- | -------- | ------------------- | --------------- |
| Rental_order | varchar(10)  |                 | NO       |                     | 出租订单编号,PK |
| Rental_id    | varchar(10)  |                 | NO       |                     | 出租商品编号    |
| Customer_id  | varchar(10)  |                 | NO       |                     | 客户id          |
| Rental_Time  | datetime     |                 | NO       |                     | 出租时间        |
| Due_date     | datetime     | 出租时间+一个月 | NO       | 默认租借时间为1个月 | 应还时间        |
| Due_Status   | nvarchar(10) | YES/NO          | NO       |                     | 归还状态        |







## SQL 语句

### 创建表

#### VCD_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_info]    Script Date: 2021/11/29 17:28:40 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_info](
	[VCD_id] [varchar](10) NOT NULL,
	[Title] [nvarchar](50) NULL,
	[Cover] [nvarchar](max) NULL,
 CONSTRAINT [PK_VCD_info] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



```

#### VCD_Source

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_Source]    Script Date: 2021/11/29 17:28:53 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_Source](
	[VCD_id] [varchar](10) NOT NULL,
	[Director] [nvarchar](50) NULL,
	[Producer] [nvarchar](50) NULL,
	[Screenwriter] [nvarchar](50) NULL,
	[Cast] [nvarchar](max) NULL,
	[Publisher] [nvarchar](50) NULL,
 CONSTRAINT [PK_VCD_Source] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



```

#### VCD_Content

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_Content]    Script Date: 2021/11/29 17:29:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_Content](
	[VCD_id] [varchar](10) NOT NULL,
	[Language] [nvarchar](50) NULL,
	[Rating] [nvarchar](10) NULL,
	[Country] [nvarchar](50) NULL,
	[Release_Time] [date] NULL,
	[Duration] [int] NULL,
	[Score] [float] NULL,
	[Resolution] [nvarchar](10) NULL,
	[Introduction] [nvarchar](max) NULL,
	[Anothername] [nvarchar](50) NULL,
 CONSTRAINT [PK_VCD_Content] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



```

#### VCD_Tag

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_Tag]    Script Date: 2021/11/29 17:29:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_Tag](
	[VCD_id] [varchar](10) NOT NULL,
	[Tag_id] [varchar](10) NOT NULL,
	[Tag_name] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_VCD_Tag] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Tag_lib

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Tag_lib]    Script Date: 2021/11/29 17:29:32 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Tag_lib](
	[Tag_id] [varchar](10) NOT NULL,
	[Tag_name] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Tag_lib] PRIMARY KEY CLUSTERED 
(
	[Tag_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Products_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Products_info]    Script Date: 2021/11/29 17:29:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Products_info](
	[VCD_id] [varchar](10) NOT NULL,
	[Title] [nvarchar](10) NOT NULL,
	[Purchase_Price] [float] NOT NULL,
	[Rental_Price] [float] NOT NULL,
	[Purchase_Stocks] [int] NOT NULL,
	[Rental_Stocks] [int] NOT NULL,
 CONSTRAINT [PK_Products_info] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Rental_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Rental_info]    Script Date: 2021/11/29 17:30:43 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Rental_info](
	[Rental_id] [varchar](10) NOT NULL,
	[Status] [nvarchar](10) NOT NULL,
	[VCD_id] [varchar](10) NOT NULL,
	[Title] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Rental_info] PRIMARY KEY CLUSTERED 
(
	[Rental_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Stock_Order

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Stock_Order]    Script Date: 2021/11/29 17:30:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Stock_Order](
	[Stock_order] [varchar](10) NOT NULL,
	[VCD_id] [varchar](10) NOT NULL,
	[Quantity_in] [int] NOT NULL,
	[PorR] [varchar](10) NOT NULL,
 CONSTRAINT [PK_Stock_Order] PRIMARY KEY CLUSTERED 
(
	[Stock_order] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Customer_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Customer_info]    Script Date: 2021/12/2 11:28:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Customer_info](
	[Customer_id] [varchar](10) NOT NULL,
	[Name] [nvarchar](10) NOT NULL,
	[Birthday] [date] NOT NULL,
	[Contact] [varchar](11) NOT NULL,
	[Credit] [varchar](10) NOT NULL,
 CONSTRAINT [PK_Customer_info] PRIMARY KEY CLUSTERED 
(
	[Customer_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Purchase_Order

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Purchase_Order]    Script Date: 2021/11/29 17:31:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Purchase_Order](
	[Purchase_order] [varchar](10) NOT NULL,
	[VCD_id] [varchar](10) NOT NULL,
	[Purchase_Out] [int] NOT NULL,
 CONSTRAINT [PK_Purchase_Order] PRIMARY KEY CLUSTERED 
(
	[Purchase_order] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Rental_Order

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Rental_Order]    Script Date: 2021/11/29 17:31:31 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Rental_Order](
	[Rental_order] [varchar](10) NOT NULL,
	[Rental_id] [varchar](10) NOT NULL,
	[Customer_id] [varchar](10) NOT NULL,
	[Rental_Time] [datetime] NOT NULL,
	[Due_date] [datetime] NOT NULL,
	[Due_Status] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Rental_Order] PRIMARY KEY CLUSTERED 
(
	[Rental_order] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```





### 触发器

#### 入库触发器

**SQL:**

```
CREATE TRIGGER Purchase_Order_Products_info
ON Purchase_Order 
FOR INSERT
	AS DECLARE @Purchase_Out_read int,@VCD_id_read varchar(10),@Purchase_Stocks_read int
	SELECT @Purchase_Out_read=Purchase_Out FROM inserted
	SELECT @VCD_id_read=VCD_id FROM inserted
	SELECT @Purchase_Stocks_read=Purchase_Stocks FROM Products_info
		WHERE @VCD_id_read=Products_info.VCD_id
	IF (@Purchase_Out_read<@Purchase_Stocks_read) AND (@Purchase_Out_read>0)
		BEGIN
			UPDATE Products_info
			SET Purchase_Stocks=Purchase_Stocks-@Purchase_Out_read
			WHERE @VCD_id_read=Products_info.VCD_id
			PRINT '操作成功！'
			RETURN
		END
	PRINT '购买数量超出库存或不能小于0！请重新输入。'
	ROLLBACK TRANSACTION
GO
```





初始库存

![9](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\9.png)



执行此段：

```
insert into Stock_Order values('114515','0001','2','P')

insert into Stock_Order values('191982','0001','1','R')
```





![10](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\10.png)

![11](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\11.png)



库存自动增加







#### 零售触发器

- 改触发器修改零售商品信息

**SQL：**

```
CREATE TRIGGER Purchase_Order_Products_info
ON Purchase_Order 
FOR INSERT
	AS DECLARE @Purchase_Out_read int,@VCD_id_read varchar(10),@Purchase_Stocks_read int
	SELECT @Purchase_Out_read=Purchase_Out FROM inserted
	SELECT @VCD_id_read=VCD_id FROM inserted
	SELECT @Purchase_Stocks_read=Purchase_Stocks FROM Products_info
		WHERE @VCD_id_read=Products_info.VCD_id
	IF (@Purchase_Out_read<@Purchase_Stocks_read) AND (@Purchase_Out_read>0)
		BEGIN
			UPDATE Products_info
			SET Purchase_Stocks=Purchase_Stocks-@Purchase_Out_read
			WHERE @VCD_id_read=Products_info.VCD_id
			PRINT '操作成功！'
			RETURN
		END
	PRINT '购买数量超出库存或不能小于0！请重新输入。'
	ROLLBACK TRANSACTION
GO
```

在购买订单表中插入的值超过已有的库存量

![QQ图片20211206202613](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202613.png)





在在购买订单表中插入的值小于购买的值

![QQ图片20211206202642](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202642.png)



![QQ图片20211206202645](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202645.png)





插入前后的表

![QQ图片20211206202649](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202649.png)

![QQ图片20211206202652](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202652.png)





#### 借阅触发器

**SQL：**

```
create trigger IfBackVCD on Rental_Order
for update
as
if update(Due_Status)
begin
 if((select inserted.Due_Status from inserted)='YES')
 begin
   update Products_info set Products_info.Rental_Stocks=Products_info.Rental_Stocks+1
   from Products_info,inserted
   where Products_info.VCD_id=(select VCD_id from inserted)
   
   update Rental_info set Rental_info.VCD_Status='在库'
   from Rental_info,inserted
   where Rental_info.Rental_id=(select Rental_id from inserted)
 end
 else
  begin
   print '修改完成'
  end
end
```



顾客信息：

![8](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\8.png)

D级以上才能借阅

 

执行：

```
insert into Rental_Order values('114514','0001','114','2021-12-2','2022-2-2','NO','0001','泰坦尼克号')
```

后，初始出租订单信息中的出租状态应为NO，自动生成出租商品信息

![1](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\1.png)

 

并对库存-1

![2](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\2.png)

 

 

执行：

```
insert into Rental_Order values('191981','0002','514','2021-12-2','2022-2-2','NO','0001','泰坦尼克号')
```

后，因信誉等级不够不能借

![3](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\3.png)





#### 归还触发器

**SQL：**

```
create trigger IfBackVCD on Rental_Order
for update
as
if update(Due_Status)
begin
 if((select inserted.Due_Status from inserted)='YES')
 begin
   update Products_info set Products_info.Rental_Stocks=Products_info.Rental_Stocks+1
   from Products_info,inserted
   where Products_info.VCD_id=(select VCD_id from inserted)
   
   update Rental_info set Rental_info.VCD_Status='在库'
   from Rental_info,inserted
   where Rental_info.Rental_id=(select Rental_id from inserted)
 end
 else
  begin
   print '修改完成'
  end
end
```



执行：update Rental_Order set Due_Status='YES' where Rental_order='114514'

将出租订单信息中的归还状态改为YES后，

![4](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\4.png)

出租商品信息的状态自动改为在库。



![6](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\6.png)

库存自动+1





#### 日志触发器

**SQL：**

```
Create TRIGGER LogRecord
ON Products_info
AFTER INSERT,UPDATE,DELETE 
/*REFERENCING NEW row AS newTuple*/
AS
BEGIN 

     declare @di table(et varchar(200),pt varchar(200),ei varchar(max))
     insert into @di exec('dbcc inputbuffer(@@spid)')


	 declare @op varchar(10)
	 select @op=case when exists(select 1 from inserted) and exists(select 1 from deleted)
                   then 'Update'
                   when exists(select 1 from inserted) and not exists(select 1 from deleted)
                   then 'Insert'
                   when not exists(select 1 from inserted) and exists(select 1 from deleted)
                   then 'Delete' end

	if @op in('Insert','Update')
	begin
	-- SET NOCOUNT ON;
	 INSERT INTO log_Table
	 (operate,login_name,runsql,UDate)
	 select @op,
	 (select login_name from sys.dm_exec_sessions where session_id=@@spid),
	 (select top 1 isnull(ei,'') from @di),
      getdate() from inserted n
	  end

	  else

	  begin
	   INSERT INTO log_Table
	 (operate,login_name,runsql,UDate)
	 select @op,
	 (select login_name from sys.dm_exec_sessions where session_id=@@spid),
	 (select top 1 isnull(ei,'') from @di),
      getdate() from deleted o
	  end

END

```

测试插入操作：



![image-20211206205347273](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211206205347273.png)



![image-20211206205426965](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211206205426965.png)





![image-20211206205501763](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211206205501763.png)











### 存储过程



#### 通过标题查询标签



```
执行结果：
EXEC Pro_SearchTag '霸王别姬
'
```

![image-20211203173223290](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203173223290.png)



```
CREATE Procedure Pro_SearchTag
@Title nvarchar(50)='泰坦尼克号' 

AS SELECT VCD_info.Title,VCD_Tag.Tag_name

FROM VCD_info INNER JOIN VCD_Tag 
				ON VCD_info.VCD_id = VCD_Tag.VCD_id

WHERE VCD_info.Title = @Title

```



#### 通过类型查询标题

```
EXEC Pro_SearchTitle 爱情	
```

![image-20211203183133982](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203183133982.png)



```
CREATE Procedure Pro_SearchTitle
@Tag nvarchar(50)='剧情' 

AS SELECT VCD_info.Title,VCD_Tag.Tag_name

FROM VCD_info INNER JOIN VCD_Tag 
				ON VCD_info.VCD_id = VCD_Tag.VCD_id

WHERE VCD_Tag.Tag_name=@Tag
```





### 视图

创建视图查询各类 VCD 的库存情况；



#### 来源

![image-20211202120101883](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211202120101883.png)

```
SELECT   dbo.VCD_info.Title AS 标题, dbo.VCD_Source.Director AS 导演, dbo.VCD_Source.Producer AS 制片人, 
                dbo.VCD_Source.Screenwriter AS 编剧, dbo.VCD_Source.Cast AS 主演, dbo.VCD_Source.Publisher AS 发行商
FROM      dbo.VCD_info INNER JOIN
                dbo.VCD_Source ON dbo.VCD_info.VCD_id = dbo.VCD_Source.VCD_id
```



#### 内容

![image-20211202115948540](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211202115948540.png)

```
SELECT   dbo.VCD_info.Title AS 标题, dbo.VCD_Content.Language AS 语言, dbo.VCD_Content.Rating AS 分级, 
                dbo.VCD_Content.Country AS 国家, dbo.VCD_Content.Release_Time AS 上映时间, 
                dbo.VCD_Content.Duration AS [时长/分钟], dbo.VCD_Content.Score AS 评分, dbo.VCD_Content.Resolution AS 质量, 
                dbo.VCD_Content.Introduction AS 简介, dbo.VCD_Content.Anothername AS 别名
FROM      dbo.VCD_info INNER JOIN
                dbo.VCD_Content ON dbo.VCD_info.VCD_id = dbo.VCD_Content.VCD_id
```



#### 标签

![image-20211207232624264](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211207232624264.png)





```
SELECT   dbo.VCD_info.Title, dbo.VCD_Tag.Tag_name
FROM      dbo.VCD_Tag INNER JOIN
                dbo.VCD_info ON dbo.VCD_Tag.VCD_id = dbo.VCD_info.VCD_id
```



#### 出租商品信息

![image-20211203174059928](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203174059928.png)



```
SELECT   dbo.VCD_info.Title AS 标题, dbo.Products_info.Rental_Price AS [出租价格/月]]], dbo.Rental_info.VCD_Status AS 状态, 
                dbo.Customer_info.Name AS 客户姓名
FROM      dbo.Rental_info INNER JOIN
                dbo.Rental_Order ON dbo.Rental_info.Rental_id = dbo.Rental_Order.Rental_id INNER JOIN
                dbo.VCD_info ON dbo.Rental_info.VCD_id = dbo.VCD_info.VCD_id INNER JOIN
                dbo.Products_info ON dbo.Rental_info.VCD_id = dbo.Products_info.VCD_id INNER JOIN
                dbo.Customer_info ON dbo.Rental_Order.Customer_id = dbo.Customer_info.Customer_id
```





#### 零售商品信息

![image-20211203174428518](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203174428518.png)



```
SELECT   dbo.VCD_info.Title AS 标题, dbo.Products_info.Purchase_Price AS 价格, 
                dbo.Purchase_Order.Purchase_order AS 购买订单编号, dbo.Purchase_Order.Purchase_Out AS 订单数量
FROM      dbo.VCD_info INNER JOIN
                dbo.Products_info ON dbo.VCD_info.VCD_id = dbo.Products_info.VCD_id INNER JOIN
                dbo.Purchase_Order ON dbo.VCD_info.VCD_id = dbo.Purchase_Order.VCD_id
```



# 前端





# 前端开发



## 开发环境



- IDE : IntelliJ IDEA 2021
- 工具：JavaFX， JDK ：Oracle OpenJDK v16.0.2
- 布局：Scene Builder
- 客制化： CSS
- 接口：JDBC sqljdbc_9.4.1.0_chs
- 服务器：SQL Server 2019



所需的外部包：

![image-20211213085215326](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085215326.png)











## Login



### 基础界面：

![image-20211213084512940](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084512940.png)





账号密码为空时登录：

![image-20211213084530295](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084530295.png)

账号密码错误：

![image-20211213084558330](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084558330.png)





由于JavaFX自带的控件不够美观，对其添加自定义的CSS文件改变布局

![image-20211213084645891](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084645891.png)

![image-20211213084657675](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084657675.png)



![image-20211213084828512](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084828512.png)

![image-20211213084840387](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084840387.png)



CSS: 添加了圆角和阴影效果

![image-20211213085021198](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085021198.png)

由于没有做自适应分辨率，因此取消顶部任务栏，改为无边框模式

![image-20211213085820898](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085820898.png)

退出键绑定在Cancel中



账号密码正确时，进入内部界面，首先创建Stage，跳转到我定义的默认的source_table布局中：

![image-20211219174530443](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219174530443.png)





### Login类代码：

**LoginController**

```
package com.gui.sqldemo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;


import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class LoginController extends HelloApplication implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;
    @FXML
    private Text loginMessageText;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Images/93492380.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }
    public void loginButtonOnAction(ActionEvent event){

        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() ==false){
            validateLogin();
        }
        else {
            loginMessageText.setText("Blank, Please enter");
        }

    }
     public void cancelButtonOnAction(){
         Stage stage = (Stage) cancelButton.getScene().getWindow();
         stage.close();

     }


     public void  validateLogin(){

        if(usernameTextField.getText().equals("sa")&&enterPasswordField.getText().equals("258866"))
        {
            loginMessageText.setText("Connect Success");
           // DataBaseConnection connectNow = new DataBaseConnection();
          //  Connection connectDB = connectNow.getConnection();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
            ViewAlter();


        }
        else {
            loginMessageText.setText("Invalid Login, Please try again");
        }


     }



     public void ViewAlter(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("source_table.fxml"));
            Stage TableStage = new Stage();
            TableStage.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root, 1280, 900);
            TableStage.setScene(scene);
            TableStage.show();
            TableStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                public void handle(WindowEvent event) {
                    //此处当stage关闭时，同时结束程序，避免stage关闭后，程序界面关闭了，但后台线程却依然运行的问题
                    System.exit(0);
                }
            });

        } catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

     }


}
```



**scratch.css:**

```
.text-field{
    -fx-background-color: #FFFFFF;
    -fx-background-radius: 100;
}


.transparent{
    -fx-background-color: rgb(0,0,0,0);
}


.shadow{
    -fx-effect: dropShadow(three-pass-box,rgba(0,0,0,0.1),10.0,0.0,0.0,10.0);
}


.button{
    -fx-background-color: #F2E635;
    -fx-background-radius: 50;
}

.button:pressed{
    -fx-background-color: #DBD030;
}



.button2{
    -fx-background-color: #699BFF;
}

.button3{
    -fx-background-color: #FF6B6B;
}



.button2:pressed{
    -fx-background-color: #5F8DE8;
}

.button3:pressed{
    -fx-background-color: #DE5D5D;
}






.table-view{
    -fx-background-color:  #E6DAC5;
    -fx-fill: white;
}

.table-view .column-header-background{
    -fx-background-color:  #D9C27E;


}

.table-view .column-header, .table-view.filler{
    -fx-size: 25;
    -fx-border-width: 0 0 10 0;
    -fx-background-color: transparent;
}

.table-view .column-header .label{
    -fx-text-fill: white;
}


.pane{
    -fx-background-color:  #E6DAC5;
    -fx-background-radius: 50;
}

.Vbox{

}
```













## FXML Controller



进入后台，每一个FXML文件对应一个Controller.java文件



![image-20211213085142308](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085142308.png)



![image-20211213085158442](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085158442.png)



## JDBC



连接数据库的过程封装成一个类：

![image-20211213085443925](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085443925.png)



![image-20211213085557213](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085557213.png)

**具体代码：**

```
package com.gui.sqldemo;
import java.sql.*;


public class DataBaseConnection {

    public Connection databaseLink;

    public Connection getConnection() {
        String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//设置SQL Server数据库引擎
        String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=VCD_MS";//指定数据库
        try {
            Class.forName(JDriver);//加载数据库引擎
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try {

            String user = "sa";
            String password = "******";
            databaseLink = DriverManager.getConnection(connectDB,user,password);
            Connection con = DriverManager.getConnection(connectDB, user, password);
            System.out.println("连接数据库成功");
            Statement cmd = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }


        return databaseLink;

}

}
```





## 信息管理界面



包括： ContentSearchController 、SourceSearchController 、TagSearchController、PurchaseSearchController 、SettingSearchController

![image-20211213085339976](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085339976.png)

### 基本信息显示

![image-20211213090008495](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090008495.png)



对 TableView 进行数据库的数据导入



![image-20211213090105185](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090105185.png)







对  TableView 进行设计导入，由于每个表的内容都不一致，因此对每个表都要设计一个数据结构：



此处举ContentSearchModel的例子：因为里面的数据包括大多数数据类型

![image-20211213090443122](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090443122.png)



ContentSearchModel中初始化的函数：

![image-20211213090553295](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090553295.png)

```
package com.gui.sqldemo;

public class ContentSearchModel {

    String title,language,rating,country,release,resolution,introduction,anothername;

    int duration;
    float score;

    public ContentSearchModel(String title,String language,String rating,String country,String release
    ,int duration,float score,String resolution,String introduction,String anothername){
        this.title = title;
        this.language = language;
        this.rating = rating;
        this.country = country;
        this.release = release;
        this.duration = duration;
        this.score = score;
        this.resolution = resolution;
        this.introduction = introduction;
        this.anothername = anothername;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getRating() {
        return rating;
    }

    public String getCountry() {
        return country;
    }

    public String getRelease() {
        return release;
    }

    public String getResolution() {
        return resolution;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getAnothername() {
        return anothername;
    }

    public int getDuration() {
        return duration;
    }

    public float getScore() {
        return score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setAnothername(String anothername) {
        this.anothername = anothername;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
```

ContentSearchController：

![image-20211213090748716](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090748716.png)

![image-20211213090313824](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090313824.png)



### 搜索功能：

搜索功能展示：

![image-20211213090218724](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090218724.png)

在我们定义的数据结构Model中提供数据调用的方法，作用与搜索模块中：

![image-20211213090628089](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090628089.png)



读取TextField中的文本，与TableView中的数据进行比对：

![image-20211213094303811](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213094303811.png)



### 界面跳转：

通过绑定点击按钮进行跳转

![image-20211219173700660](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173700660.png)

点击按钮后

![image-20211219173719741](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173719741.png)

对按钮颜色进行修改，能让用户更直观地看见目前所处的界面，同时左上方也有icon用来显示现在所处的界面。



![image-20211219173923100](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173923100.png)

![image-20211219173934062](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173934062.png)



在 Controller中对对应的按钮绑定一个ButtonOnAction，用来响应按钮点击事件。我们这里的按钮用来跳转界面，在已经创建的Stage中加载其他fxml布局，不需要关闭Stage重新创建，在视觉上可以避免重新创建的时候闪烁的bug。

![image-20211219174007799](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219174007799.png)



在fxml文件中，我们绑定了Controller，因此在跳转界面时也会切换到对应的Controller中去。

![image-20211219174258643](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219174258643.png)





### 整体Controller代码：

```
package com.gui.sqldemo;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.sql.*;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SourceSearchController implements Initializable {

    @FXML
    private TableView<SourceSearchModel> SourceTableView;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_title_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_director_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_producer_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_screenwriter_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_cast_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_publisher_TableColumn;
    @FXML
    private TextField keywordTextField;
    @FXML
    private ImageView ImageView1;
    @FXML
    private ImageView ImageView2;
    @FXML
    private ImageView ImageView3;
    @FXML
    private ImageView ImageView4;
    @FXML
    private ImageView ImageView5;
    @FXML
    private ImageView ImageView6;
    @FXML
    private ImageView ImageView7;
    @FXML
    private ImageView ImageView8;
    @FXML
    private ImageView ImageView9;
    @FXML
    private ImageView ImageView10;
    @FXML
    private Button AddButton;
    @FXML
    private Button SourceButton;
    @FXML
    private Button ContentButton;
    @FXML
    private Button TagButton;
    @FXML
    private Button PurchaseButton;
    @FXML
    private Button SettingButton;
    @FXML
    private Button ExitButton;


    ObservableList<SourceSearchModel> sourceSearchModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Images/blu_ray_disc_player_32px.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        ImageView1.setImage(brandingImage);

        brandingFile = new File("Images/add_database_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView2.setImage(brandingImage);

        brandingFile = new File("Images/repository_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView3.setImage(brandingImage);

        brandingFile = new File("Images/content_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView4.setImage(brandingImage);

        brandingFile = new File("Images/tags_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView5.setImage(brandingImage);

        brandingFile = new File("Images/purchase_order_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView6.setImage(brandingImage);

        brandingFile = new File("Images/settings_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView7.setImage(brandingImage);

        brandingFile = new File("Images/sign_out_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView8.setImage(brandingImage);

        brandingFile = new File("Images/repository_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView9.setImage(brandingImage);

        brandingFile = new File("Images/search_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView10.setImage(brandingImage);




        DataBaseConnection connectNow = new DataBaseConnection();
        Connection connectDB = connectNow.getConnection();

        String SourceViewQuery = "SELECT Title,Director,Producer,Screenwriter,Cast,Publisher "
        +" FROM  VCD_info INNER JOIN VCD_Source ON VCD_info.VCD_id = VCD_Source.VCD_id";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(SourceViewQuery);

            while (queryOutput.next()){
                String queryTitle = queryOutput.getString("Title");
                String queryDirector = queryOutput.getString("Director");
                String queryProducer = queryOutput.getString("Producer");
                String queryScreenwriter = queryOutput.getString("Screenwriter");
                String queryCast = queryOutput.getString("Cast");
                String queryPublisher = queryOutput.getString("Publisher");

                sourceSearchModelObservableList.add(new SourceSearchModel(queryTitle,queryDirector,queryProducer,queryScreenwriter
                ,queryCast,queryPublisher));
            }

            Source_title_TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            Source_director_TableColumn.setCellValueFactory(new PropertyValueFactory<>("director"));
            Source_producer_TableColumn.setCellValueFactory(new PropertyValueFactory<>("producer"));
            Source_screenwriter_TableColumn.setCellValueFactory(new PropertyValueFactory<>("screenwriter"));
            Source_cast_TableColumn.setCellValueFactory(new PropertyValueFactory<>("cast"));
            Source_publisher_TableColumn.setCellValueFactory(new PropertyValueFactory<>("publisher"));

            SourceTableView.setItems(sourceSearchModelObservableList);


            FilteredList<SourceSearchModel> filteredData = new FilteredList<>(sourceSearchModelObservableList,b -> true);

            keywordTextField.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(sourceSearchModel -> {
                    if(newValue.isEmpty() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    if (sourceSearchModel.getTitle().indexOf(searchKeyword) > -1){
                        return true;
                    }
                    else
                        return false;
                });
            });

            SortedList<SourceSearchModel> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(SourceTableView.comparatorProperty());
            SourceTableView.setItems(sortedData);




        }catch (SQLException e){
            Logger.getLogger(SourceSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }


    }


    public void AddButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("add.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void SourceButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("source_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void ContentButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("content_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    public void TagButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("tag_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void PurchaseButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("purchase_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void SettingButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("settings_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void exitButtonOnAction(){
        Stage stage = (Stage) ExitButton.getScene().getWindow();
        stage.close();
    }


}
```





## 零售模块

购买操作：

![image-20211213093349950](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093349950.png)

购买前后数量：

![image-20211213093414409](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093414409.png)

订单视图：

![image-20211213093429604](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093429604.png)



Add to Cart的按钮绑定一个事件，用于读取上方两个TextField中的文本，与数据库连接，先从VCD_info中根据Title读取VCD_id，再用VCD_id在数据库查询Product表中的价格，接着将这一系列数据写入右侧的购物车中。

这一系列数据库的操作都是基于SQL语句，通过JDBC提供的接口中，实例化我们定义的DatabaseConnect，用其中的executeQuery方法将拼接的SQL语句告诉数据库。



![image-20211219175135406](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219175135406.png)



**按键事件代码：**

```
public void AddcartButtonOnAction(ActionEvent event){

    String title;
    float price;
    int num;
    String searchSQL;
    String insertSQL;
    float total;

    if (titleTextField.getText().isBlank() == false && numTextField.getText().isBlank() ==false) {
        orderTitle.setText(titleTextField.getText());
        orderNum.setText(numTextField.getText());

        try {
            DataBaseConnection connectNow = new DataBaseConnection();
            Connection connectDB = connectNow.getConnection();
            Statement statement = connectDB.createStatement();

            title = orderTitle.getText();
            searchSQL = "SELECT Purchase_Price FROM Products_info,VCD_info WHERE Title ='" +title+"' AND VCD_info.VCD_id=Products_info.VCD_id";

            ResultSet rs = statement.executeQuery(searchSQL);

            while (rs.next())
            {
                System.out.println(rs.getFloat("Purchase_Price"));
                price = rs.getFloat("Purchase_Price");
                num = Integer.parseInt(orderNum.getText());

                total = price* (num);
                System.out.println(total);
                TotalMessageText.setText(Float.toString(total));
            }
            statement.close();
            connectDB.close();

        }catch (SQLException e){
            Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }
    }
    else {
        addMessageText.setText("Blank, Please enter!");
    }


}
```



结算事件则绑定在Buy Now！按钮中，实现方法大同小异，访问数据库的不同表：



**代码：**

```
public void BuyButtonOnAction(){

    String title;
    int num;
    String searchSQL;
    String insertSQL;
    Random random = new Random();
    int ran = random.nextInt(10000);

    if (orderTitle.getText().isBlank() == false && orderNum.getText().isBlank() ==false) {


        try {
            title = orderTitle.getText();
            num = Integer.parseInt(orderNum.getText());


            searchSQL = "SELECT VCD_id FROM VCD_info WHERE Title ='"+title+"'";



            DataBaseConnection connectNow = new DataBaseConnection();
            Connection connectDB = connectNow.getConnection();
            Statement statement = connectDB.createStatement();

            ResultSet rs = statement.executeQuery(searchSQL);

            while (rs.next())
            {
                System.out.println(rs.getString("VCD_id"));
                insertSQL = "INSERT INTO Purchase_Order VALUES('"+""+ran+"','"+rs.getString("VCD_id")+"','"+num+"');";

                System.out.println(insertSQL);

                statement.executeUpdate(insertSQL);
            }


            statement.close();
            connectDB.close();

        }catch (SQLException e){
            Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }


    }
    else
    {


    }

}
```





我们在Add中做的所有操作都会间接记录在日志中，因为我在后端定义了几个触发器，其中一个是针对Product表的触发器，用于记录表中数据的增删改，另一个则是零售触发器，零售的操作也会对该表进行操作。

![image-20211213093441161](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093441161.png)











## 开发过程的问题



### 换行符脏数据

Title中的数据有换行符，导致通过Title搜索VCD_id失败

![image-20211213093536178](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093536178.png)



使用该SQL语句解决此问题

```
UPDATE some_table 
SET some_field = REPLACE(some_field, char(13), '')
WHERE CONTAINS(some_field, char(13))
```



## 改进

- 表中插入图片，图片以URL保存
- 日志设置检查点
- 前后台系统，不同用户进入不同后台
- 出租模块、入库模块、客户信息管理模块









## 逻辑结构设计

VCD信息（VCD编号，标题，封面）

VCD来源（VCD编号，导演，制片人，编剧，主演，发行商）

VCD内容（VCD编号，语言，分级，国家地区，上映时间，时长，评分，片源质量，简介，又名）

VCD标签（VCD编号，标签编号，标签名称）

标签库（标签编号，标签名称）

商品信息（VCD编号，标题，封面，购买价格，出租价格，买断库存，租凭库存）

出租商品信息（出租商品编号，状态，VCD编号，标题）  

进货信息（进货订单编号，VCD编号，进货量）

客户信息（客户编号，姓名，出生日期，联系方式，信誉）

购买订单信息（购买订单编号，VCD编号，订单数量）

出租订单信息（出租订单编号，出租商品编号，客户编号，出租时间，应还时间，归还状态）





## 局部 E-R 图 

### VCD基本信息

![image-20211124202803937](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124202803937.png)



### VCD来源

![image-20211124202934310](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124202934310.png)







### VCD内容

![image-20211124202909522](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124202909522.png)

### 标签库

![image-20211124203000708](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203000708.png)

### 商品信息



![image-20211124203039471](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203039471.png)



### 出租商品信息

![image-20211124203058705](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203058705.png)

### 进货信息

![image-20211124203110104](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203110104.png)





### 客户信息

![image-20211124203121066](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203121066.png)





### 购买订单信息

![image-20211124203142999](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203142999.png)



### 出租订单信息

![image-20211124204829671](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124204829671.png)

## 全局 E-R 图

### 信息管理

![image-20211124203337764](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203337764.png)



### 出租零售

![image-20211124203251770](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124203251770.png)



### 总览

![image-20211124204849465](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211124204849465.png)







## 数据字典

不确定存储的数据长度，也有可能有中文，选择nvarchar类型

不确定存储的数据长度，存储只有英文、数字的选择varchar

没有具体到时间点用date

有具体时间的例如用户租借时间用datetime

### VCD信息

VCD_info

| 字段名 | 数据类型      | 默认值 | 允许非空 | 自动递增 | 备注       |
| ------ | ------------- | ------ | -------- | -------- | ---------- |
| VCD_id | varchar(10)   |        | NO       |          | VCD编号,PK |
| Title  | nvarchar(50)  |        |          |          | 标题       |
| Cover  | nvarchar(MAX) | URL    |          |          | 封面       |



### VCD来源

VCD_Source

| 字段名       | 数据类型      | 默认值 | 允许非空 | 自动递增 | 备注       |
| ------------ | ------------- | ------ | -------- | -------- | ---------- |
| VCD_id       | varchar(10)   |        | NO       |          | VCD编号,PK |
| Director     | nvarchar(50)  |        |          |          | 导演       |
| Producer     | nvarchar(50)  |        |          |          | 制片人     |
| Screenwriter | nvarchar(50)  |        |          |          | 编剧       |
| Cast         | nvarchar(MAX) |        |          |          | 主演       |
| Publisher    | nvarchar(50)  |        |          |          | 发行商     |



### VCD内容

VCD_Content

| 字段名       | 数据类型      | 默认值 | 允许非空 | 自动递增 | 备注               |
| ------------ | ------------- | ------ | -------- | -------- | ------------------ |
| VCD_id       | varchar(10)   |        | NO       |          | VCD编号,PK         |
| Language     | nvarchar(50)  |        |          |          | 语言               |
| Rating       | nvarchar(10)  |        |          |          | 分级               |
| Country      | nvarchar(50)  |        |          |          | 国家地区           |
| Release_Time | date          |        |          |          | 上映时间           |
| Duration     | INT           |        |          |          | 时长               |
| Score        | float         |        |          |          | 评分               |
| Resolution   | nvarchar(10)  |        |          |          | 片源质量（分辨率） |
| Introduction | nvarchar(MAX) |        |          |          | 简介               |
| Anothername  | nvarchar(50)  |        |          |          | 又名               |



### VCD标签

VCD_Tag

| 字段名   | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注    |
| -------- | ------------ | ------ | -------- | -------- | ------- |
| VCD_id   | varchar(10)  |        | NO       |          | VCD编号 |
| Tag_id   | varchar(10)  |        | NO       |          | Tag编号 |
| Tag_name | nvarchar(10) |        | NO       |          | Tag名称 |



### 标签库

Tag_lib

| 字段名   | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注       |
| -------- | ------------ | ------ | -------- | -------- | ---------- |
| Tag_id   | varchar(10)  |        | NO       |          | Tag编号,PK |
| Tag_name | nvarchar(10) |        | NO       |          | Tag名称    |



### 商品信息

Products_info

| 字段名          | 数据类型    | 默认值 | 允许非空 | 自动递增 | 备注       |
| --------------- | ----------- | ------ | -------- | -------- | ---------- |
| VCD_id          | varchar(10) |        | NO       |          | VCD编号,PK |
| Purchase_Price  | float       |        | NO       |          | 购买价格   |
| Rental_Price    | float       |        | NO       |          | 出租价格   |
| Purchase_Stocks | INT         |        | NO       | 入库则进 | 买断库存   |
| Rental_Stocks   | INT         |        | NO       | 入库则进 | 租凭库存   |



### 出租商品信息

Rental_info

| 字段名    | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注                |
| --------- | ------------ | ------ | -------- | -------- | ------------------- |
| Rental_id | varchar(10)  |        | NO       |          | 出租商品编号,PK     |
| Status    | nvarchar(10) |        | NO       |          | 状态，（在库/租出） |
| VCD_id    | varchar(10)  |        | NO       |          | VCD_id编号          |
| Title     | nvarchar(10) |        | NO       |          | 标题                |



### 进货订单信息

Stock_Order

| 字段名      | 数据类型    | 默认值 | 允许非空 | 自动递增 | 备注            |
| ----------- | ----------- | ------ | -------- | -------- | --------------- |
| Stock_order | varchar(10) |        | NO       |          | 入库订单编号,PK |
| VCD_id      | varchar(10) |        | NO       |          | VCD编号         |
| Quantity_in | INT         |        | NO       |          | 入库数量        |
| PorR        | varchar(10) | P/R    | NO       |          | 是否为入库      |



### 客户信息

Customer_info

| 字段名      | 数据类型     | 默认值 | 允许非空 | 自动递增 | 备注                               |
| ----------- | ------------ | ------ | -------- | -------- | ---------------------------------- |
| Customer_id | varchar(10)  |        | NO       |          | 客户编号,PK                        |
| Name        | nvarchar(10) |        | NO       |          | 姓名                               |
| Birthday    | DATE         |        | NO       |          | 出生日期                           |
| Contact     | varchar(11)  |        | NO       |          | 联系方式                           |
| Credit      | varchar(10)  | B      | NO       |          | 信誉，分A、B、C、D四级,D级不可租借 |



### 购买订单信息

Purchase_Order

| 字段名         | 数据类型    | 默认值 | 允许非空 | 自动递增 | 备注            |
| -------------- | ----------- | ------ | -------- | -------- | --------------- |
| Purchase_order | varchar(10) |        | NO       |          | 购买订单编号,PK |
| VCD_id         | varchar(10) |        | NO       |          | VCD编号         |
| Purchase_Out   | INT         |        | NO       |          | 出货量          |



### 出租订单信息

Rental_Order

| 字段名       | 数据类型     | 默认值          | 允许非空 | 自动递增            | 备注            |
| ------------ | ------------ | --------------- | -------- | ------------------- | --------------- |
| Rental_order | varchar(10)  |                 | NO       |                     | 出租订单编号,PK |
| Rental_id    | varchar(10)  |                 | NO       |                     | 出租商品编号    |
| Customer_id  | varchar(10)  |                 | NO       |                     | 客户id          |
| Rental_Time  | datetime     |                 | NO       |                     | 出租时间        |
| Due_date     | datetime     | 出租时间+一个月 | NO       | 默认租借时间为1个月 | 应还时间        |
| Due_Status   | nvarchar(10) | YES/NO          | NO       |                     | 归还状态        |







## SQL 语句

### 创建表

#### VCD_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_info]    Script Date: 2021/11/29 17:28:40 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_info](
	[VCD_id] [varchar](10) NOT NULL,
	[Title] [nvarchar](50) NULL,
	[Cover] [nvarchar](max) NULL,
 CONSTRAINT [PK_VCD_info] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



```

#### VCD_Source

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_Source]    Script Date: 2021/11/29 17:28:53 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_Source](
	[VCD_id] [varchar](10) NOT NULL,
	[Director] [nvarchar](50) NULL,
	[Producer] [nvarchar](50) NULL,
	[Screenwriter] [nvarchar](50) NULL,
	[Cast] [nvarchar](max) NULL,
	[Publisher] [nvarchar](50) NULL,
 CONSTRAINT [PK_VCD_Source] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



```

#### VCD_Content

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_Content]    Script Date: 2021/11/29 17:29:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_Content](
	[VCD_id] [varchar](10) NOT NULL,
	[Language] [nvarchar](50) NULL,
	[Rating] [nvarchar](10) NULL,
	[Country] [nvarchar](50) NULL,
	[Release_Time] [date] NULL,
	[Duration] [int] NULL,
	[Score] [float] NULL,
	[Resolution] [nvarchar](10) NULL,
	[Introduction] [nvarchar](max) NULL,
	[Anothername] [nvarchar](50) NULL,
 CONSTRAINT [PK_VCD_Content] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO



```

#### VCD_Tag

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[VCD_Tag]    Script Date: 2021/11/29 17:29:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[VCD_Tag](
	[VCD_id] [varchar](10) NOT NULL,
	[Tag_id] [varchar](10) NOT NULL,
	[Tag_name] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_VCD_Tag] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Tag_lib

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Tag_lib]    Script Date: 2021/11/29 17:29:32 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Tag_lib](
	[Tag_id] [varchar](10) NOT NULL,
	[Tag_name] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Tag_lib] PRIMARY KEY CLUSTERED 
(
	[Tag_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Products_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Products_info]    Script Date: 2021/11/29 17:29:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Products_info](
	[VCD_id] [varchar](10) NOT NULL,
	[Title] [nvarchar](10) NOT NULL,
	[Purchase_Price] [float] NOT NULL,
	[Rental_Price] [float] NOT NULL,
	[Purchase_Stocks] [int] NOT NULL,
	[Rental_Stocks] [int] NOT NULL,
 CONSTRAINT [PK_Products_info] PRIMARY KEY CLUSTERED 
(
	[VCD_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Rental_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Rental_info]    Script Date: 2021/11/29 17:30:43 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Rental_info](
	[Rental_id] [varchar](10) NOT NULL,
	[Status] [nvarchar](10) NOT NULL,
	[VCD_id] [varchar](10) NOT NULL,
	[Title] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Rental_info] PRIMARY KEY CLUSTERED 
(
	[Rental_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Stock_Order

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Stock_Order]    Script Date: 2021/11/29 17:30:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Stock_Order](
	[Stock_order] [varchar](10) NOT NULL,
	[VCD_id] [varchar](10) NOT NULL,
	[Quantity_in] [int] NOT NULL,
	[PorR] [varchar](10) NOT NULL,
 CONSTRAINT [PK_Stock_Order] PRIMARY KEY CLUSTERED 
(
	[Stock_order] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Customer_info

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Customer_info]    Script Date: 2021/12/2 11:28:03 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Customer_info](
	[Customer_id] [varchar](10) NOT NULL,
	[Name] [nvarchar](10) NOT NULL,
	[Birthday] [date] NOT NULL,
	[Contact] [varchar](11) NOT NULL,
	[Credit] [varchar](10) NOT NULL,
 CONSTRAINT [PK_Customer_info] PRIMARY KEY CLUSTERED 
(
	[Customer_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Purchase_Order

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Purchase_Order]    Script Date: 2021/11/29 17:31:19 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Purchase_Order](
	[Purchase_order] [varchar](10) NOT NULL,
	[VCD_id] [varchar](10) NOT NULL,
	[Purchase_Out] [int] NOT NULL,
 CONSTRAINT [PK_Purchase_Order] PRIMARY KEY CLUSTERED 
(
	[Purchase_order] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```

#### Rental_Order

```
USE [VCD_MS]
GO

/****** Object:  Table [dbo].[Rental_Order]    Script Date: 2021/11/29 17:31:31 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Rental_Order](
	[Rental_order] [varchar](10) NOT NULL,
	[Rental_id] [varchar](10) NOT NULL,
	[Customer_id] [varchar](10) NOT NULL,
	[Rental_Time] [datetime] NOT NULL,
	[Due_date] [datetime] NOT NULL,
	[Due_Status] [nvarchar](10) NOT NULL,
 CONSTRAINT [PK_Rental_Order] PRIMARY KEY CLUSTERED 
(
	[Rental_order] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO



```





### 触发器

#### 入库触发器

**SQL:**

```
CREATE TRIGGER Purchase_Order_Products_info
ON Purchase_Order 
FOR INSERT
	AS DECLARE @Purchase_Out_read int,@VCD_id_read varchar(10),@Purchase_Stocks_read int
	SELECT @Purchase_Out_read=Purchase_Out FROM inserted
	SELECT @VCD_id_read=VCD_id FROM inserted
	SELECT @Purchase_Stocks_read=Purchase_Stocks FROM Products_info
		WHERE @VCD_id_read=Products_info.VCD_id
	IF (@Purchase_Out_read<@Purchase_Stocks_read) AND (@Purchase_Out_read>0)
		BEGIN
			UPDATE Products_info
			SET Purchase_Stocks=Purchase_Stocks-@Purchase_Out_read
			WHERE @VCD_id_read=Products_info.VCD_id
			PRINT '操作成功！'
			RETURN
		END
	PRINT '购买数量超出库存或不能小于0！请重新输入。'
	ROLLBACK TRANSACTION
GO
```





初始库存

![9](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\9.png)



执行此段：

```
insert into Stock_Order values('114515','0001','2','P')

insert into Stock_Order values('191982','0001','1','R')
```





![10](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\10.png)

![11](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\11.png)



库存自动增加







#### 零售触发器

- 改触发器修改零售商品信息

**SQL：**

```
CREATE TRIGGER Purchase_Order_Products_info
ON Purchase_Order 
FOR INSERT
	AS DECLARE @Purchase_Out_read int,@VCD_id_read varchar(10),@Purchase_Stocks_read int
	SELECT @Purchase_Out_read=Purchase_Out FROM inserted
	SELECT @VCD_id_read=VCD_id FROM inserted
	SELECT @Purchase_Stocks_read=Purchase_Stocks FROM Products_info
		WHERE @VCD_id_read=Products_info.VCD_id
	IF (@Purchase_Out_read<@Purchase_Stocks_read) AND (@Purchase_Out_read>0)
		BEGIN
			UPDATE Products_info
			SET Purchase_Stocks=Purchase_Stocks-@Purchase_Out_read
			WHERE @VCD_id_read=Products_info.VCD_id
			PRINT '操作成功！'
			RETURN
		END
	PRINT '购买数量超出库存或不能小于0！请重新输入。'
	ROLLBACK TRANSACTION
GO
```

在购买订单表中插入的值超过已有的库存量

![QQ图片20211206202613](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202613.png)





在在购买订单表中插入的值小于购买的值

![QQ图片20211206202642](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202642.png)



![QQ图片20211206202645](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202645.png)





插入前后的表

![QQ图片20211206202649](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202649.png)

![QQ图片20211206202652](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹 (2)\QQ图片20211206202652.png)





#### 借阅触发器

**SQL：**

```
create trigger IfBackVCD on Rental_Order
for update
as
if update(Due_Status)
begin
 if((select inserted.Due_Status from inserted)='YES')
 begin
   update Products_info set Products_info.Rental_Stocks=Products_info.Rental_Stocks+1
   from Products_info,inserted
   where Products_info.VCD_id=(select VCD_id from inserted)
   
   update Rental_info set Rental_info.VCD_Status='在库'
   from Rental_info,inserted
   where Rental_info.Rental_id=(select Rental_id from inserted)
 end
 else
  begin
   print '修改完成'
  end
end
```



顾客信息：

![8](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\8.png)

D级以上才能借阅

 

执行：

```
insert into Rental_Order values('114514','0001','114','2021-12-2','2022-2-2','NO','0001','泰坦尼克号')
```

后，初始出租订单信息中的出租状态应为NO，自动生成出租商品信息

![1](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\1.png)

 

并对库存-1

![2](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\2.png)

 

 

执行：

```
insert into Rental_Order values('191981','0002','514','2021-12-2','2022-2-2','NO','0001','泰坦尼克号')
```

后，因信誉等级不够不能借

![3](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\3.png)





#### 归还触发器

**SQL：**

```
create trigger IfBackVCD on Rental_Order
for update
as
if update(Due_Status)
begin
 if((select inserted.Due_Status from inserted)='YES')
 begin
   update Products_info set Products_info.Rental_Stocks=Products_info.Rental_Stocks+1
   from Products_info,inserted
   where Products_info.VCD_id=(select VCD_id from inserted)
   
   update Rental_info set Rental_info.VCD_Status='在库'
   from Rental_info,inserted
   where Rental_info.Rental_id=(select Rental_id from inserted)
 end
 else
  begin
   print '修改完成'
  end
end
```



执行：update Rental_Order set Due_Status='YES' where Rental_order='114514'

将出租订单信息中的归还状态改为YES后，

![4](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\4.png)

出租商品信息的状态自动改为在库。



![6](C:\Users\42279\Desktop\Subject\大三上\数据库原理与应用\数据库大作业\新建文件夹\6.png)

库存自动+1





#### 日志触发器

**SQL：**

```
Create TRIGGER LogRecord
ON Products_info
AFTER INSERT,UPDATE,DELETE 
/*REFERENCING NEW row AS newTuple*/
AS
BEGIN 

     declare @di table(et varchar(200),pt varchar(200),ei varchar(max))
     insert into @di exec('dbcc inputbuffer(@@spid)')


	 declare @op varchar(10)
	 select @op=case when exists(select 1 from inserted) and exists(select 1 from deleted)
                   then 'Update'
                   when exists(select 1 from inserted) and not exists(select 1 from deleted)
                   then 'Insert'
                   when not exists(select 1 from inserted) and exists(select 1 from deleted)
                   then 'Delete' end

	if @op in('Insert','Update')
	begin
	-- SET NOCOUNT ON;
	 INSERT INTO log_Table
	 (operate,login_name,runsql,UDate)
	 select @op,
	 (select login_name from sys.dm_exec_sessions where session_id=@@spid),
	 (select top 1 isnull(ei,'') from @di),
      getdate() from inserted n
	  end

	  else

	  begin
	   INSERT INTO log_Table
	 (operate,login_name,runsql,UDate)
	 select @op,
	 (select login_name from sys.dm_exec_sessions where session_id=@@spid),
	 (select top 1 isnull(ei,'') from @di),
      getdate() from deleted o
	  end

END

```

测试插入操作：



![image-20211206205347273](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211206205347273.png)



![image-20211206205426965](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211206205426965.png)





![image-20211206205501763](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211206205501763.png)











### 存储过程



#### 通过标题查询标签



```
执行结果：
EXEC Pro_SearchTag '霸王别姬
'
```

![image-20211203173223290](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203173223290.png)



```
CREATE Procedure Pro_SearchTag
@Title nvarchar(50)='泰坦尼克号' 

AS SELECT VCD_info.Title,VCD_Tag.Tag_name

FROM VCD_info INNER JOIN VCD_Tag 
				ON VCD_info.VCD_id = VCD_Tag.VCD_id

WHERE VCD_info.Title = @Title

```



#### 通过类型查询标题

```
EXEC Pro_SearchTitle 爱情	
```

![image-20211203183133982](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203183133982.png)



```
CREATE Procedure Pro_SearchTitle
@Tag nvarchar(50)='剧情' 

AS SELECT VCD_info.Title,VCD_Tag.Tag_name

FROM VCD_info INNER JOIN VCD_Tag 
				ON VCD_info.VCD_id = VCD_Tag.VCD_id

WHERE VCD_Tag.Tag_name=@Tag
```





### 视图

创建视图查询各类 VCD 的库存情况；



#### 来源

![image-20211202120101883](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211202120101883.png)

```
SELECT   dbo.VCD_info.Title AS 标题, dbo.VCD_Source.Director AS 导演, dbo.VCD_Source.Producer AS 制片人, 
                dbo.VCD_Source.Screenwriter AS 编剧, dbo.VCD_Source.Cast AS 主演, dbo.VCD_Source.Publisher AS 发行商
FROM      dbo.VCD_info INNER JOIN
                dbo.VCD_Source ON dbo.VCD_info.VCD_id = dbo.VCD_Source.VCD_id
```



#### 内容

![image-20211202115948540](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211202115948540.png)

```
SELECT   dbo.VCD_info.Title AS 标题, dbo.VCD_Content.Language AS 语言, dbo.VCD_Content.Rating AS 分级, 
                dbo.VCD_Content.Country AS 国家, dbo.VCD_Content.Release_Time AS 上映时间, 
                dbo.VCD_Content.Duration AS [时长/分钟], dbo.VCD_Content.Score AS 评分, dbo.VCD_Content.Resolution AS 质量, 
                dbo.VCD_Content.Introduction AS 简介, dbo.VCD_Content.Anothername AS 别名
FROM      dbo.VCD_info INNER JOIN
                dbo.VCD_Content ON dbo.VCD_info.VCD_id = dbo.VCD_Content.VCD_id
```



#### 标签

![image-20211207232624264](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211207232624264.png)





```
SELECT   dbo.VCD_info.Title, dbo.VCD_Tag.Tag_name
FROM      dbo.VCD_Tag INNER JOIN
                dbo.VCD_info ON dbo.VCD_Tag.VCD_id = dbo.VCD_info.VCD_id
```



#### 出租商品信息

![image-20211203174059928](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203174059928.png)



```
SELECT   dbo.VCD_info.Title AS 标题, dbo.Products_info.Rental_Price AS [出租价格/月]]], dbo.Rental_info.VCD_Status AS 状态, 
                dbo.Customer_info.Name AS 客户姓名
FROM      dbo.Rental_info INNER JOIN
                dbo.Rental_Order ON dbo.Rental_info.Rental_id = dbo.Rental_Order.Rental_id INNER JOIN
                dbo.VCD_info ON dbo.Rental_info.VCD_id = dbo.VCD_info.VCD_id INNER JOIN
                dbo.Products_info ON dbo.Rental_info.VCD_id = dbo.Products_info.VCD_id INNER JOIN
                dbo.Customer_info ON dbo.Rental_Order.Customer_id = dbo.Customer_info.Customer_id
```





#### 零售商品信息

![image-20211203174428518](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211203174428518.png)



```
SELECT   dbo.VCD_info.Title AS 标题, dbo.Products_info.Purchase_Price AS 价格, 
                dbo.Purchase_Order.Purchase_order AS 购买订单编号, dbo.Purchase_Order.Purchase_Out AS 订单数量
FROM      dbo.VCD_info INNER JOIN
                dbo.Products_info ON dbo.VCD_info.VCD_id = dbo.Products_info.VCD_id INNER JOIN
                dbo.Purchase_Order ON dbo.VCD_info.VCD_id = dbo.Purchase_Order.VCD_id
```



# 前端





# 前端开发



## 开发环境



- IDE : IntelliJ IDEA 2021
- 工具：JavaFX， JDK ：Oracle OpenJDK v16.0.2
- 布局：Scene Builder
- 客制化： CSS
- 接口：JDBC sqljdbc_9.4.1.0_chs
- 服务器：SQL Server 2019



所需的外部包：

![image-20211213085215326](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085215326.png)











## Login



### 基础界面：

![image-20211213084512940](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084512940.png)





账号密码为空时登录：

![image-20211213084530295](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084530295.png)

账号密码错误：

![image-20211213084558330](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084558330.png)





由于JavaFX自带的控件不够美观，对其添加自定义的CSS文件改变布局

![image-20211213084645891](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084645891.png)

![image-20211213084657675](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084657675.png)



![image-20211213084828512](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084828512.png)

![image-20211213084840387](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213084840387.png)



CSS: 添加了圆角和阴影效果

![image-20211213085021198](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085021198.png)

由于没有做自适应分辨率，因此取消顶部任务栏，改为无边框模式

![image-20211213085820898](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085820898.png)

退出键绑定在Cancel中



账号密码正确时，进入内部界面，首先创建Stage，跳转到我定义的默认的source_table布局中：

![image-20211219174530443](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219174530443.png)





### Login类代码：

**LoginController**

```
package com.gui.sqldemo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;


import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class LoginController extends HelloApplication implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Button loginButton;
    @FXML
    private Text loginMessageText;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Images/93492380.jpg");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);
    }
    public void loginButtonOnAction(ActionEvent event){

        if (usernameTextField.getText().isBlank() == false && enterPasswordField.getText().isBlank() ==false){
            validateLogin();
        }
        else {
            loginMessageText.setText("Blank, Please enter");
        }

    }
     public void cancelButtonOnAction(){
         Stage stage = (Stage) cancelButton.getScene().getWindow();
         stage.close();

     }


     public void  validateLogin(){

        if(usernameTextField.getText().equals("sa")&&enterPasswordField.getText().equals("258866"))
        {
            loginMessageText.setText("Connect Success");
           // DataBaseConnection connectNow = new DataBaseConnection();
          //  Connection connectDB = connectNow.getConnection();
            Stage stage = (Stage) loginButton.getScene().getWindow();
            stage.close();
            ViewAlter();


        }
        else {
            loginMessageText.setText("Invalid Login, Please try again");
        }


     }



     public void ViewAlter(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("source_table.fxml"));
            Stage TableStage = new Stage();
            TableStage.initStyle(StageStyle.UNDECORATED);
            Scene scene = new Scene(root, 1280, 900);
            TableStage.setScene(scene);
            TableStage.show();
            TableStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                public void handle(WindowEvent event) {
                    //此处当stage关闭时，同时结束程序，避免stage关闭后，程序界面关闭了，但后台线程却依然运行的问题
                    System.exit(0);
                }
            });

        } catch (Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }

     }


}
```



**scratch.css:**

```
.text-field{
    -fx-background-color: #FFFFFF;
    -fx-background-radius: 100;
}


.transparent{
    -fx-background-color: rgb(0,0,0,0);
}


.shadow{
    -fx-effect: dropShadow(three-pass-box,rgba(0,0,0,0.1),10.0,0.0,0.0,10.0);
}


.button{
    -fx-background-color: #F2E635;
    -fx-background-radius: 50;
}

.button:pressed{
    -fx-background-color: #DBD030;
}



.button2{
    -fx-background-color: #699BFF;
}

.button3{
    -fx-background-color: #FF6B6B;
}



.button2:pressed{
    -fx-background-color: #5F8DE8;
}

.button3:pressed{
    -fx-background-color: #DE5D5D;
}






.table-view{
    -fx-background-color:  #E6DAC5;
    -fx-fill: white;
}

.table-view .column-header-background{
    -fx-background-color:  #D9C27E;


}

.table-view .column-header, .table-view.filler{
    -fx-size: 25;
    -fx-border-width: 0 0 10 0;
    -fx-background-color: transparent;
}

.table-view .column-header .label{
    -fx-text-fill: white;
}


.pane{
    -fx-background-color:  #E6DAC5;
    -fx-background-radius: 50;
}

.Vbox{

}
```













## FXML Controller



进入后台，每一个FXML文件对应一个Controller.java文件



![image-20211213085142308](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085142308.png)



![image-20211213085158442](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085158442.png)



## JDBC



连接数据库的过程封装成一个类：

![image-20211213085443925](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085443925.png)



![image-20211213085557213](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085557213.png)

**具体代码：**

```
package com.gui.sqldemo;
import java.sql.*;


public class DataBaseConnection {

    public Connection databaseLink;

    public Connection getConnection() {
        String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";//设置SQL Server数据库引擎
        String connectDB = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=VCD_MS";//指定数据库
        try {
            Class.forName(JDriver);//加载数据库引擎
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try {

            String user = "sa";
            String password = "******";
            databaseLink = DriverManager.getConnection(connectDB,user,password);
            Connection con = DriverManager.getConnection(connectDB, user, password);
            System.out.println("连接数据库成功");
            Statement cmd = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }


        return databaseLink;

}

}
```





## 信息管理界面



包括： ContentSearchController 、SourceSearchController 、TagSearchController、PurchaseSearchController 、SettingSearchController

![image-20211213085339976](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213085339976.png)

### 基本信息显示

![image-20211213090008495](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090008495.png)



对 TableView 进行数据库的数据导入



![image-20211213090105185](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090105185.png)







对  TableView 进行设计导入，由于每个表的内容都不一致，因此对每个表都要设计一个数据结构：



此处举ContentSearchModel的例子：因为里面的数据包括大多数数据类型

![image-20211213090443122](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090443122.png)



ContentSearchModel中初始化的函数：

![image-20211213090553295](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090553295.png)

```
package com.gui.sqldemo;

public class ContentSearchModel {

    String title,language,rating,country,release,resolution,introduction,anothername;

    int duration;
    float score;

    public ContentSearchModel(String title,String language,String rating,String country,String release
    ,int duration,float score,String resolution,String introduction,String anothername){
        this.title = title;
        this.language = language;
        this.rating = rating;
        this.country = country;
        this.release = release;
        this.duration = duration;
        this.score = score;
        this.resolution = resolution;
        this.introduction = introduction;
        this.anothername = anothername;
    }

    public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getRating() {
        return rating;
    }

    public String getCountry() {
        return country;
    }

    public String getRelease() {
        return release;
    }

    public String getResolution() {
        return resolution;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getAnothername() {
        return anothername;
    }

    public int getDuration() {
        return duration;
    }

    public float getScore() {
        return score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setAnothername(String anothername) {
        this.anothername = anothername;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
```

ContentSearchController：

![image-20211213090748716](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090748716.png)

![image-20211213090313824](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090313824.png)



### 搜索功能：

搜索功能展示：

![image-20211213090218724](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090218724.png)

在我们定义的数据结构Model中提供数据调用的方法，作用与搜索模块中：

![image-20211213090628089](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213090628089.png)



读取TextField中的文本，与TableView中的数据进行比对：

![image-20211213094303811](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213094303811.png)



### 界面跳转：

通过绑定点击按钮进行跳转

![image-20211219173700660](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173700660.png)

点击按钮后

![image-20211219173719741](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173719741.png)

对按钮颜色进行修改，能让用户更直观地看见目前所处的界面，同时左上方也有icon用来显示现在所处的界面。



![image-20211219173923100](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173923100.png)

![image-20211219173934062](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219173934062.png)



在 Controller中对对应的按钮绑定一个ButtonOnAction，用来响应按钮点击事件。我们这里的按钮用来跳转界面，在已经创建的Stage中加载其他fxml布局，不需要关闭Stage重新创建，在视觉上可以避免重新创建的时候闪烁的bug。

![image-20211219174007799](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219174007799.png)



在fxml文件中，我们绑定了Controller，因此在跳转界面时也会切换到对应的Controller中去。

![image-20211219174258643](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219174258643.png)





### 整体Controller代码：

```
package com.gui.sqldemo;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.sql.*;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SourceSearchController implements Initializable {

    @FXML
    private TableView<SourceSearchModel> SourceTableView;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_title_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_director_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_producer_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_screenwriter_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_cast_TableColumn;
    @FXML
    private TableColumn<SourceSearchModel,String> Source_publisher_TableColumn;
    @FXML
    private TextField keywordTextField;
    @FXML
    private ImageView ImageView1;
    @FXML
    private ImageView ImageView2;
    @FXML
    private ImageView ImageView3;
    @FXML
    private ImageView ImageView4;
    @FXML
    private ImageView ImageView5;
    @FXML
    private ImageView ImageView6;
    @FXML
    private ImageView ImageView7;
    @FXML
    private ImageView ImageView8;
    @FXML
    private ImageView ImageView9;
    @FXML
    private ImageView ImageView10;
    @FXML
    private Button AddButton;
    @FXML
    private Button SourceButton;
    @FXML
    private Button ContentButton;
    @FXML
    private Button TagButton;
    @FXML
    private Button PurchaseButton;
    @FXML
    private Button SettingButton;
    @FXML
    private Button ExitButton;


    ObservableList<SourceSearchModel> sourceSearchModelObservableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile = new File("Images/blu_ray_disc_player_32px.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        ImageView1.setImage(brandingImage);

        brandingFile = new File("Images/add_database_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView2.setImage(brandingImage);

        brandingFile = new File("Images/repository_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView3.setImage(brandingImage);

        brandingFile = new File("Images/content_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView4.setImage(brandingImage);

        brandingFile = new File("Images/tags_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView5.setImage(brandingImage);

        brandingFile = new File("Images/purchase_order_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView6.setImage(brandingImage);

        brandingFile = new File("Images/settings_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView7.setImage(brandingImage);

        brandingFile = new File("Images/sign_out_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView8.setImage(brandingImage);

        brandingFile = new File("Images/repository_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView9.setImage(brandingImage);

        brandingFile = new File("Images/search_32px.png");
        brandingImage = new Image(brandingFile.toURI().toString());
        ImageView10.setImage(brandingImage);




        DataBaseConnection connectNow = new DataBaseConnection();
        Connection connectDB = connectNow.getConnection();

        String SourceViewQuery = "SELECT Title,Director,Producer,Screenwriter,Cast,Publisher "
        +" FROM  VCD_info INNER JOIN VCD_Source ON VCD_info.VCD_id = VCD_Source.VCD_id";

        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryOutput = statement.executeQuery(SourceViewQuery);

            while (queryOutput.next()){
                String queryTitle = queryOutput.getString("Title");
                String queryDirector = queryOutput.getString("Director");
                String queryProducer = queryOutput.getString("Producer");
                String queryScreenwriter = queryOutput.getString("Screenwriter");
                String queryCast = queryOutput.getString("Cast");
                String queryPublisher = queryOutput.getString("Publisher");

                sourceSearchModelObservableList.add(new SourceSearchModel(queryTitle,queryDirector,queryProducer,queryScreenwriter
                ,queryCast,queryPublisher));
            }

            Source_title_TableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
            Source_director_TableColumn.setCellValueFactory(new PropertyValueFactory<>("director"));
            Source_producer_TableColumn.setCellValueFactory(new PropertyValueFactory<>("producer"));
            Source_screenwriter_TableColumn.setCellValueFactory(new PropertyValueFactory<>("screenwriter"));
            Source_cast_TableColumn.setCellValueFactory(new PropertyValueFactory<>("cast"));
            Source_publisher_TableColumn.setCellValueFactory(new PropertyValueFactory<>("publisher"));

            SourceTableView.setItems(sourceSearchModelObservableList);


            FilteredList<SourceSearchModel> filteredData = new FilteredList<>(sourceSearchModelObservableList,b -> true);

            keywordTextField.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(sourceSearchModel -> {
                    if(newValue.isEmpty() || newValue.isBlank() || newValue == null) {
                        return true;
                    }

                    String searchKeyword = newValue.toLowerCase();

                    if (sourceSearchModel.getTitle().indexOf(searchKeyword) > -1){
                        return true;
                    }
                    else
                        return false;
                });
            });

            SortedList<SourceSearchModel> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(SourceTableView.comparatorProperty());
            SourceTableView.setItems(sortedData);




        }catch (SQLException e){
            Logger.getLogger(SourceSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }


    }


    public void AddButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("add.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void SourceButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("source_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void ContentButtonOnAction(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("content_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    public void TagButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("tag_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void PurchaseButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("purchase_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void SettingButtonOnAction(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("settings_table.fxml"));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void exitButtonOnAction(){
        Stage stage = (Stage) ExitButton.getScene().getWindow();
        stage.close();
    }


}
```





## 零售模块

购买操作：

![image-20211213093349950](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093349950.png)

购买前后数量：

![image-20211213093414409](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093414409.png)

订单视图：

![image-20211213093429604](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093429604.png)



Add to Cart的按钮绑定一个事件，用于读取上方两个TextField中的文本，与数据库连接，先从VCD_info中根据Title读取VCD_id，再用VCD_id在数据库查询Product表中的价格，接着将这一系列数据写入右侧的购物车中。

这一系列数据库的操作都是基于SQL语句，通过JDBC提供的接口中，实例化我们定义的DatabaseConnect，用其中的executeQuery方法将拼接的SQL语句告诉数据库。



![image-20211219175135406](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211219175135406.png)



**按键事件代码：**

```
public void AddcartButtonOnAction(ActionEvent event){

    String title;
    float price;
    int num;
    String searchSQL;
    String insertSQL;
    float total;

    if (titleTextField.getText().isBlank() == false && numTextField.getText().isBlank() ==false) {
        orderTitle.setText(titleTextField.getText());
        orderNum.setText(numTextField.getText());

        try {
            DataBaseConnection connectNow = new DataBaseConnection();
            Connection connectDB = connectNow.getConnection();
            Statement statement = connectDB.createStatement();

            title = orderTitle.getText();
            searchSQL = "SELECT Purchase_Price FROM Products_info,VCD_info WHERE Title ='" +title+"' AND VCD_info.VCD_id=Products_info.VCD_id";

            ResultSet rs = statement.executeQuery(searchSQL);

            while (rs.next())
            {
                System.out.println(rs.getFloat("Purchase_Price"));
                price = rs.getFloat("Purchase_Price");
                num = Integer.parseInt(orderNum.getText());

                total = price* (num);
                System.out.println(total);
                TotalMessageText.setText(Float.toString(total));
            }
            statement.close();
            connectDB.close();

        }catch (SQLException e){
            Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }
    }
    else {
        addMessageText.setText("Blank, Please enter!");
    }


}
```



结算事件则绑定在Buy Now！按钮中，实现方法大同小异，访问数据库的不同表：



**代码：**

```
public void BuyButtonOnAction(){

    String title;
    int num;
    String searchSQL;
    String insertSQL;
    Random random = new Random();
    int ran = random.nextInt(10000);

    if (orderTitle.getText().isBlank() == false && orderNum.getText().isBlank() ==false) {


        try {
            title = orderTitle.getText();
            num = Integer.parseInt(orderNum.getText());


            searchSQL = "SELECT VCD_id FROM VCD_info WHERE Title ='"+title+"'";



            DataBaseConnection connectNow = new DataBaseConnection();
            Connection connectDB = connectNow.getConnection();
            Statement statement = connectDB.createStatement();

            ResultSet rs = statement.executeQuery(searchSQL);

            while (rs.next())
            {
                System.out.println(rs.getString("VCD_id"));
                insertSQL = "INSERT INTO Purchase_Order VALUES('"+""+ran+"','"+rs.getString("VCD_id")+"','"+num+"');";

                System.out.println(insertSQL);

                statement.executeUpdate(insertSQL);
            }


            statement.close();
            connectDB.close();

        }catch (SQLException e){
            Logger.getLogger(AddSearchController.class.getName()).log(Level.SEVERE,null,e);
            e.printStackTrace();
        }


    }
    else
    {


    }

}
```





我们在Add中做的所有操作都会间接记录在日志中，因为我在后端定义了几个触发器，其中一个是针对Product表的触发器，用于记录表中数据的增删改，另一个则是零售触发器，零售的操作也会对该表进行操作。

![image-20211213093441161](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093441161.png)











## 开发过程的问题



### 换行符脏数据

Title中的数据有换行符，导致通过Title搜索VCD_id失败

![image-20211213093536178](C:\Users\42279\AppData\Roaming\Typora\typora-user-images\image-20211213093536178.png)



使用该SQL语句解决此问题

```
UPDATE some_table 
SET some_field = REPLACE(some_field, char(13), '')
WHERE CONTAINS(some_field, char(13))
```



## 改进

- 表中插入图片，图片以URL保存
- 日志设置检查点
- 前后台系统，不同用户进入不同后台
- 出租模块、入库模块、客户信息管理模块



