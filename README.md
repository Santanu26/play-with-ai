## Create your single page website with AI
# AI Generate Prompt API

This API provides functionality to generate HTML content for single-page websites based on a given topic. It utilizes an AI client to generate HTML5 content with multiple tabs, visually appealing styles, and valid copy for individual sections.

## Endpoints

### Get Website Content
- **URL:** `/api/v1/website/{topic}`
- **Method:** GET
- **Produces:** Text/HTML
- **Parameters:**
    - `{topic}`: Path variable representing the topic for which website content should be generated.
- **Description:** Retrieves HTML content for a single-page website based on the provided topic.
- **Example Request:**
  ## Technologies Used

<li>Java</li>
  <li>Spring Framework</li>
  <li>Spring Boot</li>
  
## Usage
  Send a GET request to the 
  /api/v1/website/{topic} endpoint, providing the desired topic as a path variable.
  Receive HTML content for a single-page website tailored to the specified topic.
  Dependencies
  org.springframework.ai.client.AiClient
 ## Note
  This API relies on an external AI client to generate HTML content based on the provided topic.
  Ensure proper error handling and input validation in production usage.