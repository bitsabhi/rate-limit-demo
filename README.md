# Rate-Limiting API

This is a simple Spring Boot application that demonstrates how to implement rate-limiting using the Bucket4j library. The application exposes a single API endpoint that returns a message, but it limits the number of requests that can be made within a specific time period.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [API Usage](#api-usage)
  - [Example Curl Requests](#example-curl-requests)
- [Rate Limiting Configuration](#rate-limiting-configuration)
- [Project Structure](#project-structure)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed on your system:

- **Java 8 or higher**
- **Gradle 4.0 or higher**
- An IDE like **IntelliJ IDEA**, **Eclipse**, or **Visual Studio Code**

### Installation

Follow these steps to set up the project locally:

1. **Clone the repository**:

   ```bash
   git clone https://github.com/bitsabhi/x.git
   cd rate-limiting-api
2. **API Usage**:   
  ```bash
    for i in {1..12}; do curl -X GET http://localhost:8080/api/hmu; echo ""; done
 ```