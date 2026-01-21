# Smart Email Assistant

Smart Email Assistant is an AI-powered web application that helps users compose, rewrite, summarize, and generate professional email replies using Generative AI.
The system follows clean layered architecture, integrates LLM APIs, and exposes secure REST APIs for frontend consumption.

# Core Functionalities

Generate professional emails from intent

Rewrite emails (formal, polite, short, strong)

Auto-reply to received emails

Grammar & tone improvement

Save email history (optional)

Secure & scalable backend

🛠️ Tech Stack (Job-Oriented)
Backend

Java 17

Spring Boot 3.x

Spring Web

Spring Validation

Lombok

REST APIs

OpenAI / Gemini API

Frontend

React.js

Tailwind CSS

Axios
```
📂 BACKEND – Project Structure (Spring Boot)
smart-email-assistant-backend
│
├── src/main/java
│   └── com/smart/emailassistant
│
│       ├── SmartEmailAssistantApplication.java
│
│       ├── controller
│       │   └── EmailController.java
│
│       ├── service
│       │   ├── EmailService.java
│       │   └── impl
│       │       └── EmailServiceImpl.java
│
│       ├── dto
│       │   ├── EmailRequestDTO.java
│       │   └── EmailResponseDTO.java
│
│       ├── ai
│       │   ├── PromptBuilder.java
│       │   └── AIClient.java
│
│       ├── config
│       │   └── AIConfig.java
│
│       ├── exception
│       │   ├── GlobalExceptionHandler.java
│       │   └── CustomException.java
│
│       └── util
│           └── EmailTone.java
│
├── src/main/resources
│   ├── application.yml
│   └── banner.txt
│
├── pom.xml
└── README.md
```

# Backend Flow (Clean Architecture)
Controller → Service → AI Client → LLM API → Response

🧩 Important Backend Components
1️⃣ Controller Layer

Handles HTTP requests

Validates input

Returns clean API responses

2️⃣ Service Layer

Business logic

Calls AI service

Builds prompts

3️⃣ AI Layer

Prompt engineering

External AI API integration

4️⃣ DTO Layer

Request & response models

No entity exposure

# FRONTEND – Project Structure (React)
```
smart-email-assistant-frontend
│
├── src
│   ├── api
│   │   └── axiosConfig.js
│
│   ├── components
│   │   ├── EmailForm.jsx
│   │   ├── EmailResult.jsx
│   │   └── ToneSelector.jsx
│
│   ├── pages
│   │   └── Dashboard.jsx
│
│   ├── App.jsx
│   ├── main.jsx
│   └── index.css
│
├── public
│
├── package.json
└── README.md
```

# Frontend Responsibilities

Collect user intent

Select email tone

Call backend APIs

Display AI-generated email

🔐 Sample REST API Design
Generate Email
POST /api/email/generate


Request

{
  "intent": "Follow up on job application",
  "tone": "PROFESSIONAL"
}


Response

{
  "generatedEmail": "I hope this message finds you well..."
}



Built responsive UI using React and Tailwind CSS

👉 Next Steps (Tell Me What You Want)
