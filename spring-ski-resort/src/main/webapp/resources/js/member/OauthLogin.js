document.getElementById('naver_id_login').addEventListener('click', () => {
    NaverLoginPage().then(result => {
        window.location.href = result;
    })
})

async function NaverLoginPage() {
    try {
        const url = "/oauth/naver/login";
        const config = {
            method: 'get'
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (error) {
        console.log(error);
    }
}
