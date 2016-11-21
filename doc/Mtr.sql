USE [master]
GO
/****** Object:  Database [MetOrderSystem]    Script Date: 2016/11/21 20:06:41 ******/
CREATE DATABASE [MetOrderSystem]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'MetOrderSystem', FILENAME = N'E:\Program Files (x86)\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\MetOrderSystem.mdf' , SIZE = 5120KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'MetOrderSystem_log', FILENAME = N'E:\Program Files (x86)\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\MetOrderSystem_log.ldf' , SIZE = 2560KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [MetOrderSystem] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [MetOrderSystem].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [MetOrderSystem] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [MetOrderSystem] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [MetOrderSystem] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [MetOrderSystem] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [MetOrderSystem] SET ARITHABORT OFF 
GO
ALTER DATABASE [MetOrderSystem] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [MetOrderSystem] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [MetOrderSystem] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [MetOrderSystem] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [MetOrderSystem] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [MetOrderSystem] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [MetOrderSystem] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [MetOrderSystem] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [MetOrderSystem] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [MetOrderSystem] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [MetOrderSystem] SET  DISABLE_BROKER 
GO
ALTER DATABASE [MetOrderSystem] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [MetOrderSystem] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [MetOrderSystem] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [MetOrderSystem] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [MetOrderSystem] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [MetOrderSystem] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [MetOrderSystem] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [MetOrderSystem] SET RECOVERY FULL 
GO
ALTER DATABASE [MetOrderSystem] SET  MULTI_USER 
GO
ALTER DATABASE [MetOrderSystem] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [MetOrderSystem] SET DB_CHAINING OFF 
GO
ALTER DATABASE [MetOrderSystem] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [MetOrderSystem] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [MetOrderSystem]
GO
/****** Object:  Table [dbo].[MtrProperty]    Script Date: 2016/11/21 20:06:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[MtrProperty](
	[mtrnumber] [varchar](50) NOT NULL,
	[mtrname] [varchar](50) NULL,
	[meetingtable] [bit] NULL,
	[peoplenumber] [int] NULL,
	[media] [bit] NULL,
	[microphone] [int] NULL,
	[whiteboard] [int] NULL,
	[blackboard] [int] NULL,
	[aircondition] [bit] NULL,
 CONSTRAINT [PK_MtrProperty] PRIMARY KEY CLUSTERED 
(
	[mtrnumber] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OrderTime]    Script Date: 2016/11/21 20:06:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[OrderTime](
	[OTnumber] [varchar](50) NOT NULL,
	[datestart] [smalldatetime] NOT NULL,
	[dateend] [smalldatetime] NOT NULL,
	[timestart] [time](1) NOT NULL,
	[timeend] [time](1) NOT NULL,
	[bookedby] [varchar](50) NOT NULL,
	[mtrnumber] [varchar](50) NOT NULL,
	[theme] [varchar](100) NULL,
	[tip] [varchar](300) NULL,
	[type] [int] NOT NULL,
 CONSTRAINT [PK_OrderTime] PRIMARY KEY CLUSTERED 
(
	[OTnumber] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 2016/11/21 20:06:41 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[unit] [varchar](50) NOT NULL,
	[name] [varchar](50) NOT NULL,
	[isadmin] [bit] NOT NULL,
	[mail] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[MtrProperty]  WITH CHECK ADD  CONSTRAINT [FK_MtrProperty_MtrProperty] FOREIGN KEY([mtrnumber])
REFERENCES [dbo].[MtrProperty] ([mtrnumber])
GO
ALTER TABLE [dbo].[MtrProperty] CHECK CONSTRAINT [FK_MtrProperty_MtrProperty]
GO
ALTER TABLE [dbo].[OrderTime]  WITH CHECK ADD  CONSTRAINT [FK_OrderTime_MtrProperty] FOREIGN KEY([mtrnumber])
REFERENCES [dbo].[MtrProperty] ([mtrnumber])
GO
ALTER TABLE [dbo].[OrderTime] CHECK CONSTRAINT [FK_OrderTime_MtrProperty]
GO
ALTER TABLE [dbo].[OrderTime]  WITH CHECK ADD  CONSTRAINT [FK_OrderTime_Users] FOREIGN KEY([bookedby])
REFERENCES [dbo].[Users] ([username])
GO
ALTER TABLE [dbo].[OrderTime] CHECK CONSTRAINT [FK_OrderTime_Users]
GO
USE [master]
GO
ALTER DATABASE [MetOrderSystem] SET  READ_WRITE 
GO
