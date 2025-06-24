# CETPRO Social Project – Technical Overview

## 🔧 Project Stack
- **Backend**: Java 17 (IntelliJ IDEA, Spring Boot)
- **Frontend**: Angular (latest stable version)
- **Database**: MongoDB

---

## ✅ Project Purpose
This CSR initiative by our CETPRO institute delivers **free technical tutorials** and **community support** using real-world technology tools, empowering learners to build and maintain their own computer systems.

---

## 🛠️ Setup Instructions (Imperatives)
1. **Clone** the repository:  
   `git clone https://github.com/YourOrg/cetpro-social-project.git`  
2. **Navigate** into backend:  
   `cd cetpro-social-project/backend`  
3. **Run** Spring Boot app:  
   `./mvnw spring-boot:run`  
4. **Navigate** into frontend:  
   `cd ../frontend`  
5. **Install** dependencies and **serve** the Angular app:  
   `npm install`  
   `ng serve`  

---

## 🧩 How to Use the App (Advice with “should”)
- You **should** open `http://localhost:4200` after both backend and frontend are running.  
- You **should** create a user account to access the tutorials.  
- You **should** submit feedback via the "Contact Us" form after trying each tutorial.

---

## 🎯 Future Plans (Advice & Suggestions)
- We **should** integrate Firebase hosting before the final release.  
- We **should** implement user roles (admin, student) to control content access.  
- We **should** schedule community coding workshops during the semester.

---

## 📁 Repository Structure
For open source projects, say how it is licensed.
/cetpro-social-project
├─ backend/ # Java 17 + Spring Boot REST API
├─ frontend/ # Angular application
├─ README.md # ← You are here
├─ CONTRIBUTING.md # Contribution guidelines
├─ .env.example # Environment variables template
└─ docs/ # Technical specs & architecture diagrams
---

## 🧑‍🏫 Contributing (Imperatives & Advice)
- **Fork** this repo.  
- **Create** a feature branch:  
  `git checkout -b feature/your-feature-name`  
- **Implement**, **test**, and **lint** your feature locally.  
- **Open** a Pull Request with a clear summary and description.  
  > You **should** add “Fixes #\<issue-number\>” in your PR if it's related to an open issue.

---

## 🚀 Deployment Requirements (Must & Need To)
- You **must** set the environment variables:
- MONGODB_URI=your_mongodb_uri
- JWT_SECRET=your_jwt_secret_key
- - You **need to** enable CORS in the Spring configuration for frontend access.  
- You **must** build the frontend before deployment:  
`npm run build` in `/frontend/`  
Upload contents of `dist/` to your hosting platform.

---

## 💡 Best Practices & Tips
- You **should** write unit tests (JUnit for backend, Jasmine/Karma for frontend).  
- You **should** document any new REST endpoints in the README or API specification.  
- You **should** run `mvn clean` and `npm run lint` before each commit.

---

## 📞 Questions & Support
If you need help:
- **Open** an issue in this repository.  
- **Tag** `@project-lead` for urgent issues.  
- **Join** our group chat on Discord or Telegram for real-time collaboration.

---

**Thank you for your contributions!**  
👍 *Let's build something meaningful together.*
