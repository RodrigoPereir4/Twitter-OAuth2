<h1 align="center">🐦 Twitter OAuth2 com Spring Security</h1>

<p align="center">
  Um projeto simples que simula um micro Twitter com autenticação via <strong>OAuth2</strong>, tokens JWT, controle de acesso por <em>roles</em> e integração com <strong>Docker</strong>.
</p>

<hr/>

<h2>🚀 Tecnologias Utilizadas</h2>

<ul>
  <li>✅ Java 21</li>
  <li>✅ Spring Boot + Spring Security (OAuth2)</li>
  <li>✅ JWT (JSON Web Token)</li>
  <li>✅ Docker + Docker Compose</li>
  <li>✅ MySQL</li>
  <li>✅ JPA / Hibernate</li>
</ul>

<hr/>

<h2>⚙️ Funcionalidades</h2>

<ul>
  <li>🔐 Autenticação e autorização com OAuth2</li>
  <li>🧾 Geração de token JWT com <code>scope</code> baseado em roles</li>
  <li>🛡️ Controle de acesso com <code>@PreAuthorize</code></li>
  <li>🐳 Banco de dados MySQL containerizado via Docker</li>
  <li>✉️ Endpoints protegidos e públicos para simular postagens</li>
</ul>

<hr/>

<h2>📦 Como executar</h2>

<ol>
  <li><strong>Clone o projeto:</strong><br/>
  </li>
  <li><strong>Suba o banco com Docker:</strong><br/>
    <code>docker-compose up -d</code>
  </li>
  <li><strong>Execute o projeto com Maven:</strong><br/>
    <code>./mvnw spring-boot:run</code>
  </li>
</ol>

<hr/>

<h2>📬 Testando com Postman</h2>

<p>
  <strong>1.</strong> Faça uma requisição <code>POST</code> para <code>/login</code> com usuário e senha válidos<br/>
  <strong>2.</strong> Capture o <code>accessToken</code> retornado e armazene como variável de ambiente<br/>
  <strong>3.</strong> Use esse token como <code>Bearer Token</code> nos headers dos próximos endpoints<br/>
  <strong>4.</strong> Teste endpoints protegidos com base nas permissões (ex: <code>ADMIN</code>)
</p>

<hr/>

<h2>📚 Objetivo</h2>

<p>Este projeto foi criado com foco <strong>educacional</strong> para entender na prática como funciona o fluxo de autenticação OAuth2 com JWT usando Spring Security.</p>

<hr/>
