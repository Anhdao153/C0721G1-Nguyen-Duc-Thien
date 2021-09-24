CREATE TABLE `class` (
  `idHoc_Sinh` int NOT NULL,
  `Điểm` int DEFAULT NULL,
  `Môn Học` varchar(45) DEFAULT NULL,
  `Tên học sinh` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idHoc_Sinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci