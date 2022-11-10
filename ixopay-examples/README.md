
# README

This is a [Spring Boot](https://spring.io/projects/spring-boot) based sample application for the IXOPAY SDK.

The sample application shows 
 - how to create a transaction (`/create`) based on user interaction (`/index` with a `<form>`) 
 - how to handle the status URL redirect by displaying transaction status (`/status/{id}`)
 - optionally how to handle callbacks (`/callback/{id}`)

## Running the Sample

### Configuration

Export the necessary environment variables

```shell
export IXOPAY_API_KEY=your_api_key
export IXOPAY_API_USER_USERNAME=your_api_username
export IXOPAY_API_USER_PASSWORD=your_api_password

# optional, if the tested adapter requires signing
export IXOPAY_SHARED_SECRET=your_shared_secret

# optional, use pgrok to expose this application (https://github.com/jerson/pgrok)
# if set transaction will be created with a callbackUrl and callbacks logged to stdout
export IXOPAY_CALLBACK_BASE_URL=https://your-pgrok-domain.example.org
```

<details closed>
<summary>With direnv/autoenv/etc.</summary>
Create the file `.env.local` in the root SDK project with the above environment variables.
</details>

### Starting

In the SDK root path run

```shell
./gradlew ixopay-examples:bootRun
```

Open http://localhost:8080 (or your optionally configured `IXOPAY_CALLBACK_BASE_URL`) in your browser.
