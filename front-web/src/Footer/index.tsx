import './styles.css';
import { ReactComponent as YoutubeIcon } from './youtube.svg'
import { ReactComponent as LinkedInIcon } from './linkedin.svg'
import { ReactComponent as InstagramIcon } from './instagram.svg'

function Footer() {
  return (
    <footer className="main-footer">
      App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
      <div className="footer-icons">
        <a href="https://www.youtube.com/c/DevSuperior" target="_new">
          <YoutubeIcon />
        </a>
        <a href="https://www.linkedin.com/in/elias-lima-298373190" target="_new">
          <LinkedInIcon />
        </a>
        <a href="https://www.instagram.com/sr.smith906" target="_new">
          <InstagramIcon />
        </a>
      </div>

    </footer>
  )
}

export default Footer;