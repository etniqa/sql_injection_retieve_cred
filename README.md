LR11
SQL injection
1. Trying to authenticate:
![image](https://user-images.githubusercontent.com/42249010/171628001-925edba9-8c8b-4b8e-af3f-01c4d858b9ea.png)
2. Retrieving user data using corrupted search pattern of product by name:
![image](https://user-images.githubusercontent.com/42249010/171628024-624f51ab-1212-4028-9f6b-ae3f74fb7fc7.png)
3 Check admin creds
![image](https://user-images.githubusercontent.com/42249010/171628063-1cb490ea-c22c-4b6e-b839-ad2c47f5750c.png)
4 Use PreparedStatement instead of plain SQL string concatenation:
![image](https://user-images.githubusercontent.com/42249010/171628079-63d1405e-cdbd-4db7-96e5-dde8cd505e09.png)
