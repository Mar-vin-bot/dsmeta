import axios from 'axios';
import icon from'../../assests/img/notification-icon.svg'
import { BASE_URL } from '../../utils/request';
import './style.css'

type Props = {
    saleId: number;
}

function hendleClick(id: number){
    
    axios(`${BASE_URL}/sales/${id}/notification`)
    .then(response =>{
        console.log("sucesso")
    })
}



function NotificationButton({saleId} : Props) {
    return (
        <div className="dsmeta-red-btn"
        onClick={()=> hendleClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    )
}

export default NotificationButton